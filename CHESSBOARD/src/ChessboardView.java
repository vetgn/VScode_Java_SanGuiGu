package src;

import java.util.Scanner;

public class ChessboardView {
    Chessman chessman = new Chessman();

    Chessboard chessboard = new Chessboard();

    int[][] chessboards = new int[100][100];// 棋盘的数组

    Scanner scan = new Scanner(System.in);

    /**
     * 主菜单目录
     */
    public void menu() {
        char menu01;
        System.out.println();
        System.out.println("----------欢迎来到五子棋游戏----------");
        System.out.println("----------作者:朱军军----------");
        System.out.println("----------2022.2.28----------");
        System.out.println("1.规定五子棋的长宽:");
        System.out.println("2.人人对战");
        System.out.println("3.人机对战(随机数)");
        System.out.println("4.退出");
        // System.out.println("5.创建棋盘:");
        System.out.print("请输入数字(1-4)");
        menu01 = scan.next().charAt(0);
        switch (menu01) {
            case '1':
                chess_board();
                break;
            case '2':
                chess_board_person_person();
                break;
            case '3':
                chess_board_person_computer();
                break;
            case '4':
                System.out.print("是否确认退出(Y/N)?:");
                char menu02 = scan.next().charAt(0);
                if (menu02 == 'Y') {
                    break;
                } else if (menu02 == 'N') {
                    System.out.println();
                    System.out.println();
                    menu();
                } else {
                    System.out.println("输入错误!请重新输入!");
                    System.out.println();
                    System.out.println();

                    menu();
                }
                /*
                 * case '5':
                 * chessnewboard();
                 */
        }

    }

    /**
     * 初始化游戏
     */
    public void Initialize() {
        for (int i = 0; i < chessboard.getRow(); i++) {
            for (int j = 0; j < chessboard.getCol(); j++) {
                chessboards[i][j] = 0;// 规定棋盘为0
            }
        }
        chessboard.setChessman(chessboards);// 封装起来
    }

    /**
     * 生成棋子
     * 
     * @param tybe
     * @param y
     */
    private void chess_men(int tybe, String y) {
        // 生成白棋
        if (tybe == 1) {
            System.out.print("-●");
        } // 生成黑棋
        else if (tybe == -1) {
            System.out.print("-○");
        } // 生成棋盘
        else {
            System.out.print(y);
        }

    }

    /**
     * 定义棋盘的大小
     */
    private void chess_board() {
        System.out.println("----------请输入棋盘的长宽:----------");
        System.out.println();
        System.out.print("请输入行长:");
        int x = scan.nextInt();
        chessboard.setRow(x);// 输入棋盘的行长

        System.out.print("请输入竖长:");
        int y = scan.nextInt();
        chessboard.setCol(y);// 输入棋盘的列长
        System.out.println("----------输入完成----------");

        menu();
    }

    /**
     * 生成棋盘
     */
    private void chessnewboard() {
        for (int i = 0; i < chessboard.getRow(); i++) {

            System.out.println();

            if (i == 0) {

                for (int j = 0; j < chessboard.getCol(); j++) {

                    if (j == 0) {
                        chess_men(chessboards[i][j], "┏━");
                    }
                    if (j > 0 && j < chessboard.getCol() - 1) {
                        chess_men(chessboards[i][j], "┯━");
                    }
                    if (j == chessboard.getCol() - 1) {
                        chess_men(chessboards[i][j], "┓");
                    }

                }
            }

            if (i > 0 && i < chessboard.getCol() - 1) {

                for (int j = 0; j < chessboard.getCol(); j++) {

                    if (j == 0) {
                        chess_men(chessboards[i][j], "┠");
                    }
                    if (j > 0 && j < chessboard.getCol() - 1) {
                        chess_men(chessboards[i][j], "-┼");
                    }
                    if (j == chessboard.getCol() - 1) {
                        chess_men(chessboards[i][j], "-┨");
                    }
                }
            }

            if (i == chessboard.getCol() - 1) {
                for (int j = 0; j < chessboard.getCol(); j++) {

                    if (j == 0) {
                        chess_men(chessboards[i][j], "┗━");
                    }
                    if (j > 0 && j < chessboard.getCol() - 1) {
                        chess_men(chessboards[i][j], "┷━");
                    }
                    if (j == chessboard.getCol() - 1) {
                        chess_men(chessboards[i][j], "┛");
                    }
                }
            }

        }
    }

    /**
     * 判断棋盘是否下满了
     * 
     * @return
     */
    private int is_full(int chessboards[][], int x, int y) {
        int total = 0;
        if (chessboards[x][y] == 1 || chessboards[x][y] == -1) {
            total++;
        }
        if (total >= chessboard.getCol() * chessboard.getRow()) {
            return 1;
        } else {
            return -1;
        }

    }

    /**
     * 判断棋盘是否赢了(没有补充完整)
     * 
     * @return
     */
    private boolean Win() {
        for (int i = 0; i < chessboard.getCol(); i++) {
            for (int j = 0; j < chessboard.getRow(); j++) {
                if (chessboards[i][j] == 0) {
                    continue;
                }
                if (chessboards[i][j] == chessboards[i][j + 1] && chessboards[i][j] == chessboards[i][j + 2]
                        && chessboards[i][j] == chessboards[i][j + 3]
                        && chessboards[i][j] == chessboards[i][j + 4]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 人人对战
     */
    private void chess_board_person_person() {
        System.out.println("----------生成棋盘----------");
        System.out.println();
        chessnewboard();
        int x, y;
        int k = 1;
        for (int i = 1; i <= chessboard.getCol() * chessboard.getRow(); i++) {
            k++;
            if (i % 2 != 0) {
                System.out.println();
                System.out.print("请黑子下棋,输入坐标:");
                x = scan.nextInt();
                y = scan.nextInt();

                switch (is_full(chessboards, x, y)) {
                    case 1:
                        break;
                    case -1:
                        while (true) {
                            if (chessboards[x][y] == 0) {
                                break;
                            }
                            System.out.println("刚才的位置有子!请重新输入!");
                            System.out.print("请黑子下棋,输入坐标:");
                            x = scan.nextInt();
                            y = scan.nextInt();

                        }
                }

                chessboards[x][y] = -1;
                chessnewboard();
                if (Win()) {
                    System.out.println("黑棋获胜!");
                    menu();
                }

                if (k > chessboard.getCol() * chessboard.getRow()) {

                    System.out.println("棋盘已经下满!");
                    menu();
                }
            } else if (i % 2 == 0) {
                System.out.println();
                System.out.print("请白子下棋,输入坐标:");
                x = scan.nextInt();
                y = scan.nextInt();

                switch (is_full(chessboards, x, y)) {
                    case 1:
                        break;
                    case -1:
                        while (true) {

                            if (chessboards[x][y] == 0) {
                                break;
                            }
                            System.out.println("刚才的位置有子!请重新输入!");
                            System.out.print("请白子下棋,输入坐标:");
                            x = scan.nextInt();
                            y = scan.nextInt();
                        }
                }
                chessboards[x][y] = 1;
                chessnewboard();

                if (Win()) {
                    System.out.println("白棋获胜!");
                    menu();
                }

                if (k > chessboard.getCol() * chessboard.getRow()) {

                    System.out.println("棋盘已经下满!");
                    menu();
                }

            }
        }
    }

    /**
     * 人机对战
     */
    private void chess_board_person_computer() {
        System.out.println("没有添加内容!");
    }

    public static void main(String[] args) {
        ChessboardView chessboardview = new ChessboardView();
        chessboardview.menu();
    }
}
