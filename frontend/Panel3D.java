package frontend;

import Swing3D.*;
import backend.*;
import backend.N.RNode;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.event.MouseWheelListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;


// class to Manage displaying the cargo space and user controls
public class Panel3D extends JPanel {

    public Panel3D(int width, int height, int depth, int edge_size, Dimension dim){
        
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.edge_size = edge_size;
        this.dimension = dim;

        this.g3d = new Graphics3D(new int[]{(int)(dim.getWidth()/2),(int)(dim.getHeight()/2),1000});
        this.cube_group = new SObjectGroup<SCuboid>(new int[]{(int)(dim.getWidth()/2),(int)(dim.getHeight()/2),depth*edge_size/2});       
        this.cube_group.setSpace(buildCubeGroup(buildColorMatrix()));
        
        initListeners();
        setPreferredSize(this.dimension);

    }

    // displays also cubes that are translucent
    public void displayTraslucent(){
        display_translucent = !display_translucent;
        this.cube_group.displayTranslucent(display_translucent);
        repaint();
    }

    // set a new color 3d space to paint
    public void setCargo(Color[][][] color_matrix){

        SCuboid[][][] cubes = this.cube_group.getObjectSpace();

        for(int x = 0; x != width; ++x){
            for(int y = 0; y != height; ++y){
                for(int z = 0; z != depth; ++z){ 
                    SCuboid c = cubes[x][y][z];                     
                    c.setColor(color_matrix[x][y][z]);
                    if(Color.GRAY.equals(c.getColor())){
                        c.setTranslucent(true);
                    }else c.setTranslucent(false);
                }
            }
        }
        // we always need to update the Space of the cube group, so it can determine the new cubes to display
        this.cube_group.setSpace(cubes);
    }

    // build a color matrix
    private Color[][][] buildColorMatrix(){
        Color[][][] cargo_local = new Color[width][height][depth];
        for(int x = 0; x != width; ++x){
            for(int y = 0; y != height; ++y){
                for(int z = 0; z != depth; ++z){
                    cargo_local[x][y][z] = Color.GRAY;
                }
            }
        }
        return cargo_local;
    }

    
    // display full solution
    public void displaySolution(LinkedList<N.RNode> solution_stack){
        displaySolution(solution_stack,solution_stack.size());
    }

    // display only first 'range' elements on the screen
    public void displaySolution(LinkedList<N.RNode> solution_stack, int range){
        Color[][][] color_matrix = buildColorMatrix();
        Iterator<N.RNode> it = solution_stack.iterator();
        int price = 0;
        int space = 0;
        int total_space = width*height*depth;

        for(int i = 0; i != range; ++i){
            N.RNode n = it.next(); 
            price += n.getPrice();
            space += n.getSpace();

            int[][][] piece= n.getPiece();
            int[] coords = n.getCoords();
            Color c = getColor(n.getColor());

            for(int x = 0; x != piece.length; ++x){
                for(int y = 0; y != piece[0].length; ++y){
                    for(int z = 0; z != piece[0][0].length; ++z){
                        if(piece[x][y][z] == 1){
                            color_matrix[x+coords[0]][y+coords[1]][z+coords[2]] = c;
                        }
                    }
                }
            }
        }
        setCargo(color_matrix);
        total_price.setText("Price: " + price);
        cargo_util.setText(" ,Percentage of cargo filled: " + (space/(double)total_space));
        price_per_block.setText(" ,Price per block: " + (price/(double)total_space));

        repaint();
    }

    // generates color based on color id
    private Color getColor(int color_id){
        switch(color_id){
            case 1:
                return new Color(150 + generator.nextInt(106),0,0);
            case 2:
                return new Color(0,150 + generator.nextInt(106),0);
            case 3:
                return new Color(0,0,150 + generator.nextInt(106));
            default:
                return Color.GRAY;
        }
    }

    
    // initializes all the listeners for user control
    private void initListeners(){
        total_price = new JLabel();
        cargo_util = new JLabel();
        price_per_block = new JLabel();
        total_price.setForeground(Color.WHITE);
        cargo_util.setForeground(Color.WHITE);
        price_per_block.setForeground(Color.WHITE);
        add(total_price);
        add(cargo_util);
        add(price_per_block);

        class MyKL implements KeyListener{

            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    cube_group.rotateX(Math.PI/32);
                    repaint();
                }
                else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    cube_group.rotateY(Math.PI/32);
                    repaint();
                }
                else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    cube_group.rotateY(-Math.PI/32);
                    repaint();
                }
                else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    cube_group.rotateX(-Math.PI/32);
                    repaint();
                }
                else if(e.getKeyCode() == KeyEvent.VK_R){
                    cube_group.rotateZ(Math.PI/32);
                    repaint();
                }
                else if(e.getKeyCode() == KeyEvent.VK_Z){
                    cube_group.zoom(25);
                    repaint();
                }
                else if(e.getKeyCode() == KeyEvent.VK_X){
                    cube_group.zoom(-25);
                    repaint();
                }
                
                
            }
            public void keyReleased(KeyEvent e){}
            public void keyTyped(KeyEvent e){}
        }
        addKeyListener(new MyKL());


        class MyML extends MouseAdapter{

            public void mousePressed(MouseEvent e){ requestFocus();}

        } 

        class MyMW implements MouseWheelListener{

            public void mouseWheelMoved(MouseWheelEvent e){
                cube_group.zoom(25*e.getWheelRotation()*-1);
                repaint();
            }

        }
        class MyMM extends MouseMotionAdapter{

            public void mouseDragged(MouseEvent e){ 
                int new_x = e.getX();    
                int new_y = e.getY();  
                  
                cube_group.rotateY(Math.PI/256*(x-new_x));
                cube_group.rotateX(Math.PI/256*(y-new_y));
                x=  new_x;
                y = new_y;
                repaint();
                requestFocus();
            }

            public void mouseMoved(MouseEvent e){
                x = e.getX();
                y = e.getY();
            }

            int x, y;
        } 

        addMouseListener(new MyML());
        addMouseMotionListener(new MyMM());
        addMouseWheelListener(new MyMW());
    }

    // builds a matrix of cubes from an 3d color matrix 
    private SCuboid[][][] buildCubeGroup(Color[][][] color_matrix){
        
        SCuboid[][][] cubes = new SCuboid[width][height][depth];
        int x_beg = (int)dimension.getWidth()/2 - (width*edge_size/2);
        int y_beg = (int)dimension.getHeight()/2 - (height*edge_size/2); 
        for(int x = 0; x != width; ++x){
            for(int y = 0; y != height; ++y){
                for(int z = 0; z != depth; ++z){ 
                    SCuboid c = new SCuboid(x_beg + x*edge_size,y_beg + y*edge_size, z*edge_size, edge_size, edge_size, edge_size);
                    c.setColor(color_matrix[x][y][z]);

                    if(Color.GRAY.equals(c.getColor())){
                        c.setTranslucent(true);
                    }else c.setTranslucent(false);           
                    
                    cubes[x][y][z] = c;
                }
            }
        }
        return cubes;
    }



    // paints the cargo space on the screen
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0, 750, 750);
        
        g3d.setGraphics(g2d);
        g3d.drawGroup(cube_group);
        
        
    }
    private JLabel total_price;
    private JLabel cargo_util; 
    private JLabel price_per_block;

    private Random generator = new Random();
    private Graphics3D g3d;
    private SObjectGroup<SCuboid> cube_group;
    private Dimension dimension;
    private int edge_size;
    private int width, height, depth;
    private boolean display_translucent = true;
    
}
