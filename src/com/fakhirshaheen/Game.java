package com.fakhirshaheen;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;


import javax.swing.*;

public class Game extends JFrame implements GLEventListener {

    static private final long serialVersionUID = 1L;
           private final int  width            = 800;
           private final int  height           = 600;

    public Game(){
        super("Minimal OpenGL");
        GLProfile profile = GLProfile.get(GLProfile.GL3);
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLCanvas canvas = new GLCanvas(capabilities);
        canvas.addGLEventListener(this);

        this.setName("Minimal OpenGL");
        this.getContentPane().add(canvas);

        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        canvas.requestFocusInWindow();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL3 gl = drawable.getGL().getGL3();
        gl.glClear(GL3.GL_COLOR_BUFFER_BIT | GL3.GL_DEPTH_BUFFER_BIT);

        gl.glFlush();
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL3 gl = drawable.getGL().getGL3();
        gl.glClearColor(0.392f, 0.584f, 0.929f, 1.0f);
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }

    public void play() {

    }


}
