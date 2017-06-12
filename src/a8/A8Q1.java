package a8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author millc9988
 */
 
public class A8Q1 extends JComponent {

    public static Color RandomCol(){
        double rand1 =(Math.random() * (255 - 0) + 0);
        double rand2 =(Math.random() * (255 - 0) + 0);
        double rand3 =(Math.random() * (255 - 0) + 0);
        int randA=(int)rand1;
        int randB=(int)rand2;
        int randC=(int)rand3;
        Color randCol = new Color(randA,randB,randC);
        
        
        
        
        return randCol;
        
    }
    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // GAME VARIABLES WOULD GO HERE
    Color peach = new Color(230, 201, 201);
    int pacmanX = 0;
    int pacmanD = 1;
    int wocca = 0;
    int pacAngle = 270;
    int browLY = 290;
    int browRY = 290;
    int browWidth = 10;
    int browRD = -1;
    int browLD = 0;
    int winkPOS = 0;
    int winkD = 0;
    int wink2POS = 0;
    int wink2D = 0;
    int eyeSize = 40;
    int irisSize = eyeSize / 2;
    int pupilSize = irisSize / 2;
    int rip = 0;
    int irisPos = eyeSize / 4;
    int pupilPos = irisPos + eyeSize / 8;
    Color random = new Color(0,0,0);
    Color random2 = new Color(0,0,0);
    int eye1Pos = 290-eyeSize/4;
    int eye2Pos = 410-eyeSize/4;
    int[] polyX ={490,540,540};
    int[] polyY ={445,450,420};
    String pisters = "Please give me a good mark";
    // GAME VARIABLES END HERE   

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE 

        //face
        g.setColor(peach);
        g.fillOval(200, 150, 350, 400);

        //hat
        g.setColor(Color.red);
        g.fillArc(200, 150, 350, 250, 180, -180);
        g.fillRoundRect(100, 255, 400, 20, 25, 25);
        
        //nose
        g.setColor(Color.black);
        g.drawArc(380, 400, 15, 10, 180, -180);
        g.drawArc(350, 400, 15, 10, 180, -180);
        g.drawLine(380, 405, 365, 405);
        g.drawLine(395, 405, 370, 350);
        g.drawLine(350, 405, 370, 350);

        //eye
        g.setColor(Color.white);
        g.fillOval(290-eyeSize/4, 300, eyeSize, eyeSize);
        g.fillOval(410-eyeSize/4, 300, eyeSize, eyeSize);

        //iris
        g.setColor(random);
        g.fillOval(eye1Pos + irisPos, 300 + irisPos, irisSize, irisSize);
        g.setColor(random2);
        g.fillOval(eye2Pos + irisPos, 300 + irisPos, irisSize, irisSize);

        //pupils
        g.setColor(Color.black);
        g.fillOval(eye2Pos + pupilPos, 300 + pupilPos, pupilSize, pupilSize);
        g.fillOval(eye1Pos + pupilPos, 300 + pupilPos, pupilSize, pupilSize);

        //eyebrow
        g.setColor(Color.yellow);
        g.fillRect(290-eyeSize/4, browLY, eyeSize, browWidth);
        g.fillRect(410-eyeSize/4, browRY, eyeSize, browWidth);

        //mouth
        g.setColor(Color.pink);
        g.fillArc(255, 400, 250, 75, 180, 180);
        g.setColor(Color.BLACK);
        g.drawArc(255, 425, 250, 30, 180, 180);
        //speaking
        g.setColor(Color.white);
        g.fillOval(525,400,200,70);
        g.fillPolygon(polyX,polyY,3);
        g.setColor(Color.BLACK);
        g.drawString(pisters, 525, 440);
        

        //eyelashes
        //g.drawLine(290, 300, 290,305+ winkPOS);
        //g.drawLine(295, 300, 295,305+ winkPOS);
        //g.drawLine(300, 300, 300,305+ winkPOS);
        // g.drawLine(305, 300, 305,305+ winkPOS);
        //   g.drawLine(310, 300, 310,305+ winkPOS);
        //  g.drawLine(315, 300, 315,305+ winkPOS);
        //  g.drawLine(320, 300, 320,305+ winkPOS);
        // g.drawLine(325, 300, 325,305+ winkPOS);
        //g.drawLine(329, 300, 329,305+ winkPOS);
        //second set of eyelashes
        //g.drawLine(290+120, 300, 290+120,305+ wink2POS);
        //g.drawLine(295+120, 300, 295+120,305+ wink2POS);
        //g.drawLine(300+120, 300, 300+120,305+ wink2POS);
        //g.drawLine(305+120, 300, 305+120,305+ wink2POS);
        //g.drawLine(310+120, 300, 310+120,305+ wink2POS);
        //g.drawLine(315+120, 300, 315+120,305+ wink2POS);
        //g.drawLine(320+120, 300, 320+120,305+ wink2POS);
        //g.drawLine(325+120, 300, 325+120,305+ wink2POS);
        //g.drawLine(329+120, 300, 329+120,305+ wink2POS);
        //eyelids
        g.setColor(peach);
        g.fillRect(290-eyeSize/4, 300, eyeSize, winkPOS);
        g.fillRect(410-eyeSize/4, 300, eyeSize, wink2POS);
        
        //pacman
        g.setColor(Color.yellow);
        g.fillArc(pacmanX, 500, 75, 75, 45, pacAngle);


        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE
            if (browRY == 275) {
                browRD = 1;
                browLD = -1;
            }
            if (browRY == 290) {
                browRD = -1;
            }
            if (browLY == 275) {
                browLD = 1;
            }
            browRY = browRY + browRD;
            browLY = browLY + browLD;
            if (winkPOS == 0) {
                winkD = 1;
            }
            if (winkPOS >= eyeSize) {
                winkD = -1;
            }
            if (winkD==-1) {
                   wink2D=1; 
                }

            if (wink2POS-1>=0) {
                System.out.println("please");
            if (winkD==1) {
                wink2D=-1;
                System.out.println("Kill me");
            }
            }
            winkPOS = winkPOS + winkD;
            wink2POS = wink2POS + wink2D;

            if (pacmanX > WIDTH - 75) {
                pacmanD = -3;
            }
            if (pacmanX < 1) {
                pacmanD = 3;
            }
            pacmanX = pacmanX + pacmanD;
            if (wocca < 5) {
                pacAngle = 360;
                wocca++;
            } else {
                if (wocca == 5) {
                    wocca = 20;
                }
                if ((wocca > 5)) {
                    pacAngle = 270;
                    wocca = wocca - 1;
                }
                if (wocca == 6) {
                    wocca = -5;
                }
                if (done) {
                }
                if (rip > 20) {
                    Double size = (Math.random() * 80) + 40;
                    eyeSize = size.intValue();
                    irisSize = eyeSize / 2;
                    pupilSize = irisSize / 2;
                    rip = 0;
                    random = RandomCol();
                    random2 = RandomCol();
                }
                rip++;
                irisPos = eyeSize / 4;
                pupilPos = irisPos + eyeSize / 8;
            }
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");

        // creates an instance of my game
        A8Q1 game = new A8Q1();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        game.addMouseListener(new Mouse());

        // starts the game loop
        game.run();
    }

    // Used to implement any of the Mouse Actions
    private static class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private static class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
}