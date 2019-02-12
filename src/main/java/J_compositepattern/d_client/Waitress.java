package J_compositepattern.d_client;

import J_compositepattern.a_component.MenuComponent;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }
}
