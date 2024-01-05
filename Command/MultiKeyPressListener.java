package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class MultiKeyPressListener implements KeyListener {
    // Set of currently pressed keys
    private final Set<Integer> pressedKeys = new HashSet<>();
    Editor a;
    MultiKeyPressListener(Editor b){
        a=b;
    }

    @Override
    public synchronized void keyPressed(KeyEvent e) {
        System.out.print("a\n");
        pressedKeys.add(e.getKeyCode());
        if (!pressedKeys.isEmpty()) {
            for (Iterator<Integer> it = pressedKeys.iterator(); it.hasNext();) {
                if(pressedKeys.contains(KeyEvent.VK_CONTROL)) {
                    if(pressedKeys.contains(KeyEvent.VK_A) && pressedKeys.contains(KeyEvent.VK_W)) {
                        a.executeCommand(new CopyCommand(a));
                        for(int i=0;i<5;i++)
                            a.executeCommand(new PasteCommand(a));
                        it.next();
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_C)) {
                        a.executeCommand(new CopyCommand(a));
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_X)) {
                        a.executeCommand(new CutCommand(a));
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_V)) {
                        a.executeCommand(new PasteCommand(a));
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_Z)) {
                        a.executeCommand(new UndoCommand(a));
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_W)) {
                        for(int i=0;i<5;i++)
                            a.executeCommand(new FontUpCommand(a));
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_S)) {
                        for(int i=0;i<5;i++)
                            a.executeCommand(new FontDownCommand(a));
                        it.next();
                    }
                }
                else if(pressedKeys.contains(KeyEvent.VK_Z)) {
                    if(pressedKeys.contains(KeyEvent.VK_W)) {
                        a.executeCommand(new FontUpCommand(a));
                        it.next();
                    }
                    else if(pressedKeys.contains(KeyEvent.VK_S)) {
                        a.executeCommand(new FontDownCommand(a));
                        it.next();
                    }
                }
                it.next();
            }
        }
    }

    @Override
    public synchronized void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) { /* Not used */ }
}
