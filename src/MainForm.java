
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public final class MainForm extends javax.swing.JFrame {

    public int a = 0;
    public int b = 5;
    
    public MainForm() {
        initComponents();
        dateNow.setText("2023-08-08");
        addRowToJTable();
    }

    
        public String DateTime(int Year, int Month, int Day) {
            String date = Year+"-"+Month+"-"+Day;
            return date;
        }
    

    public class EmployeeData{
        public String id;
        public String name;
        public String birthDay;
        public EmployeeData(String Id, String Name, String BirthDay){
            this.id = Id;
            this.name = Name;
            this.birthDay = BirthDay;
        }
    }
    
    public ArrayList ListEmployee(){
        ArrayList<EmployeeData> employeeList = new ArrayList<EmployeeData>();
        employeeList.add(new EmployeeData("BDI-001", "Ethan Thompson", DateTime(2006, 10, 23)));
        employeeList.add(new EmployeeData("BDI-002", "Ava Williams", DateTime(2010, 11, 26)));
        employeeList.add(new EmployeeData("BDI-003", "Benjamin Davis", DateTime(2007, 10, 24)));
        employeeList.add(new EmployeeData("BDI-004", "Olivia Martinez", DateTime(2002, 8, 19)));
        employeeList.add(new EmployeeData("BDI-005", "Liam Garcia", DateTime(1998, 7, 16)));
        employeeList.add(new EmployeeData("BDI-006", "Mia Smith", DateTime(1996, 6, 14)));
        employeeList.add(new EmployeeData("BDI-007", "Samuel Johnson", DateTime(2010, 11, 26)));
        employeeList.add(new EmployeeData("BDI-008", "Sophia Harris", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-009", "Daniel Lee", DateTime(1982, 1, 2)));
        employeeList.add(new EmployeeData("BDI-010", "Charlotte Turner", DateTime(2003, 9, 20)));
        employeeList.add(new EmployeeData("BDI-011", "Henry Martin", DateTime(1994, 5, 13)));
        employeeList.add(new EmployeeData("BDI-012", "Amelia Lewis", DateTime(1985, 2, 5)));
        employeeList.add(new EmployeeData("BDI-013", "Jackson Robinson", DateTime(1981, 1, 2)));
        employeeList.add(new EmployeeData("BDI-014", "Harper Clark", DateTime(1996, 6, 15)));
        employeeList.add(new EmployeeData("BDI-015", "Lucas King", DateTime(1984, 2, 5)));
        employeeList.add(new EmployeeData("BDI-016", "Evelyn Hall", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-017", "Alexander Young", DateTime(1986, 3, 6)));
        employeeList.add(new EmployeeData("BDI-018", "Grace Turner", DateTime(1980, 1, 1)));
        employeeList.add(new EmployeeData("BDI-019", "William Adams", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-020", "Victoria Baker", DateTime(2006, 10, 23)));
        employeeList.add(new EmployeeData("BDI-021", "James Hall", DateTime(1996, 6, 15)));
        employeeList.add(new EmployeeData("BDI-022", "Zoe Lewis", DateTime(2010, 11, 27)));
        employeeList.add(new EmployeeData("BDI-023", "Benjamin Reed", DateTime(1990, 4, 10)));
        employeeList.add(new EmployeeData("BDI-024", "Mia Collins", DateTime(1997, 7, 16)));
        employeeList.add(new EmployeeData("BDI-025", "Samuel White", DateTime(1990, 4, 9)));
        employeeList.add(new EmployeeData("BDI-026", "Ava Phillips", DateTime(1980, 1, 1)));
        employeeList.add(new EmployeeData("BDI-027", "David Rodriguez", DateTime(1986, 3, 6)));
        employeeList.add(new EmployeeData("BDI-028", "Lily Green", DateTime(1980, 1, 1)));
        employeeList.add(new EmployeeData("BDI-029", "Henry Turner", DateTime(2010, 11, 26)));
        employeeList.add(new EmployeeData("BDI-030", "Chloe Smith", DateTime(2000, 8, 18)));
        employeeList.add(new EmployeeData("BDI-031", "Michael Campbell", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-032", "Emily Anderson", DateTime(2011, 11, 27)));
        employeeList.add(new EmployeeData("BDI-033", "John Hernandez", DateTime(2006, 10, 23)));
        employeeList.add(new EmployeeData("BDI-034", "Abigail Scott", DateTime(2008, 10, 25)));
        employeeList.add(new EmployeeData("BDI-035", "Daniel Perez", DateTime(1998, 7, 16)));
        employeeList.add(new EmployeeData("BDI-036", "Ella Collins", DateTime(1990, 4, 9)));
        employeeList.add(new EmployeeData("BDI-037", "Matthew Sanchez", DateTime(1981, 1, 2)));
        employeeList.add(new EmployeeData("BDI-038", "Scarlett Taylor", DateTime(1995, 6, 13)));
        employeeList.add(new EmployeeData("BDI-039", "Samuel Mitchell", DateTime(1996, 6, 14)));
        employeeList.add(new EmployeeData("BDI-040", "Sophia Nelson", DateTime(2008, 10, 25)));
        employeeList.add(new EmployeeData("BDI-041", "David Brown", DateTime(2005, 9, 22)));
        employeeList.add(new EmployeeData("BDI-042", "Harper Johnson", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-043", "Christopher Ross", DateTime(2006, 9, 22)));
        employeeList.add(new EmployeeData("BDI-044", "Amelia Moore", DateTime(1993, 5, 12)));
        employeeList.add(new EmployeeData("BDI-045", "Logan Mitchell", DateTime(1991, 5, 10)));
        employeeList.add(new EmployeeData("BDI-046", "Elizabeth Cooper", DateTime(1983, 2, 3)));
        employeeList.add(new EmployeeData("BDI-047", "Andrew Foster", DateTime(1994, 6, 13)));
        employeeList.add(new EmployeeData("BDI-048", "Madison Turner", DateTime(1996, 6, 14)));
        employeeList.add(new EmployeeData("BDI-049", "Benjamin Flores", DateTime(1997, 7, 15)));
        employeeList.add(new EmployeeData("BDI-050", "Penelope Butler", DateTime(2005, 9, 22)));
        employeeList.add(new EmployeeData("BDI-051", "Samuel Scott", DateTime(1997, 7, 16)));
        employeeList.add(new EmployeeData("BDI-052", "Emily Nelson", DateTime(1999, 7, 17)));
        employeeList.add(new EmployeeData("BDI-053", "Joseph Rivera", DateTime(1993, 5, 12)));
        employeeList.add(new EmployeeData("BDI-054", "Avery Turner", DateTime(1985, 2, 5)));
        employeeList.add(new EmployeeData("BDI-055", "William Cox", DateTime(1996, 6, 15)));
        employeeList.add(new EmployeeData("BDI-056", "Sofia Garcia", DateTime(2007, 10, 24)));
        employeeList.add(new EmployeeData("BDI-057", "Ethan Baker", DateTime(1999, 7, 17)));
        employeeList.add(new EmployeeData("BDI-058", "Grace Adams", DateTime(1989, 4, 8)));
        employeeList.add(new EmployeeData("BDI-059", "Daniel Coleman", DateTime(1991, 5, 10)));
        employeeList.add(new EmployeeData("BDI-060", "Harper Jenkins", DateTime(1997, 7, 16)));
        employeeList.add(new EmployeeData("BDI-061", "Aiden Phillips", DateTime(1989, 4, 9)));
        employeeList.add(new EmployeeData("BDI-062", "Mia Turner", DateTime(2009, 11, 26)));
        employeeList.add(new EmployeeData("BDI-063", "Benjamin Lewis", DateTime(2005, 9, 22)));
        employeeList.add(new EmployeeData("BDI-064", "Chloe Martinez", DateTime(1993, 5, 12)));
        employeeList.add(new EmployeeData("BDI-065", "Samuel Adams", DateTime(2011, 11, 27)));
        employeeList.add(new EmployeeData("BDI-066", "Lily Turner", DateTime(1994, 6, 13)));
        employeeList.add(new EmployeeData("BDI-067", "Alexander Peterson", DateTime(1990, 4, 10)));
        employeeList.add(new EmployeeData("BDI-068", "Amelia Reed", DateTime(1984, 2, 5)));
        employeeList.add(new EmployeeData("BDI-069", "Michael White", DateTime(2010, 11, 26)));
        employeeList.add(new EmployeeData("BDI-070", "Olivia Turner", DateTime(2006, 10, 23)));
        employeeList.add(new EmployeeData("BDI-071", "James Hernandez", DateTime(2002, 8, 19)));
        employeeList.add(new EmployeeData("BDI-072", "Zoe Anderson", DateTime(2003, 9, 20)));
        employeeList.add(new EmployeeData("BDI-073", "William Collins", DateTime(1996, 6, 14)));
        employeeList.add(new EmployeeData("BDI-074", "Emily Roberts", DateTime(2007, 10, 24)));
        employeeList.add(new EmployeeData("BDI-075", "Jackson Lewis", DateTime(1980, 1, 1)));
        employeeList.add(new EmployeeData("BDI-076", "Grace Carter", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-077", "David Martinez", DateTime(1984, 2, 5)));
        employeeList.add(new EmployeeData("BDI-078", "Ava Reed", DateTime(2008, 10, 25)));
        employeeList.add(new EmployeeData("BDI-079", "Henry Thompson", DateTime(1986, 3, 6)));
        employeeList.add(new EmployeeData("BDI-080", "Sophia Turner", DateTime(1987, 3, 7)));
        employeeList.add(new EmployeeData("BDI-081", "Christopher Lee", DateTime(1997, 7, 16)));
        employeeList.add(new EmployeeData("BDI-082", "Charlotte King", DateTime(2002, 8, 19)));
        employeeList.add(new EmployeeData("BDI-083", "Samuel Campbell", DateTime(1995, 6, 13)));
        employeeList.add(new EmployeeData("BDI-084", "Harper Turner", DateTime(1984, 2, 5)));
        employeeList.add(new EmployeeData("BDI-085", "Benjamin Wright", DateTime(1983, 2, 3)));
        employeeList.add(new EmployeeData("BDI-086", "Mia Davis", DateTime(1985, 2, 5)));
        employeeList.add(new EmployeeData("BDI-087", "Michael Turner", DateTime(1998, 7, 16)));
        employeeList.add(new EmployeeData("BDI-088", "Elizabeth Hall", DateTime(2001, 8, 18)));
        employeeList.add(new EmployeeData("BDI-089", "Ethan Green", DateTime(1992, 5, 11)));
        employeeList.add(new EmployeeData("BDI-090", "Lily Martinez", DateTime(2002, 8, 19)));
        employeeList.add(new EmployeeData("BDI-091", "Alexander Scott", DateTime(2002, 8, 20)));
        employeeList.add(new EmployeeData("BDI-092", "Abigail Turner", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-093", "Daniel Adams", DateTime(1983, 2, 4)));
        employeeList.add(new EmployeeData("BDI-094", "Grace Johnson", DateTime(2010, 11, 26)));
        employeeList.add(new EmployeeData("BDI-095", "William Turner", DateTime(1998, 7, 16)));
        employeeList.add(new EmployeeData("BDI-096", "Mia Moore", DateTime(2007, 10, 24)));
        employeeList.add(new EmployeeData("BDI-097", "James Johnson", DateTime(2010, 11, 26)));
        employeeList.add(new EmployeeData("BDI-098", "Zoe White", DateTime(1992, 5, 11)));
        employeeList.add(new EmployeeData("BDI-099", "Samuel Smith", DateTime(1994, 6, 13)));
        employeeList.add(new EmployeeData("BDI-100", "Emily Turner", DateTime(2008, 10, 25)));
        employeeList.add(new EmployeeData("BDI-101", "Benjamin Mitchell", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-102", "Ava Turner", DateTime(1989, 4, 9)));
        employeeList.add(new EmployeeData("BDI-103", "Christopher Turner", DateTime(1997, 7, 16)));
        employeeList.add(new EmployeeData("BDI-104", "Sophia Davis", DateTime(2003, 8, 20)));
        employeeList.add(new EmployeeData("BDI-105", "David Scott", DateTime(1983, 2, 3)));
        employeeList.add(new EmployeeData("BDI-106", "Harper Martinez", DateTime(2006, 10, 23)));
        employeeList.add(new EmployeeData("BDI-107", "Henry Turner", DateTime(1982, 2, 3)));
        employeeList.add(new EmployeeData("BDI-108", "Olivia Adams", DateTime(1997, 7, 16)));
        employeeList.add(new EmployeeData("BDI-109", "Alexander Reed", DateTime(1984, 2, 4)));
        employeeList.add(new EmployeeData("BDI-110", "Amelia Turner", DateTime(2004, 9, 21)));
        employeeList.add(new EmployeeData("BDI-111", "Samuel Turner", DateTime(2002, 8, 20)));
        employeeList.add(new EmployeeData("BDI-112", "Grace Hernandez", DateTime(2003, 8, 20)));
        employeeList.add(new EmployeeData("BDI-113", "Michael Collins", DateTime(1983, 2, 3)));
        employeeList.add(new EmployeeData("BDI-114", "Mia Turner", DateTime(1984, 2, 4)));
        employeeList.add(new EmployeeData("BDI-115", "Benjamin Turner", DateTime(1980, 1, 1)));
        employeeList.add(new EmployeeData("BDI-116", "Emily Martin", DateTime(1999, 7, 17)));
        employeeList.add(new EmployeeData("BDI-117", "William Nelson", DateTime(1994, 6, 13)));
        employeeList.add(new EmployeeData("BDI-118", "Ava Anderson", DateTime(2000, 8, 18)));
        employeeList.add(new EmployeeData("BDI-119", "James Turner", DateTime(1990, 4, 9)));
        employeeList.add(new EmployeeData("BDI-120", "Charlotte Lewis", DateTime(2005, 9, 22)));
        employeeList.add(new EmployeeData("BDI-121", "Samuel Garcia", DateTime(2008, 10, 25)));
        employeeList.add(new EmployeeData("BDI-122", "Olivia Carter", DateTime(2001, 8, 19)));
        employeeList.add(new EmployeeData("BDI-123", "Alexander Turner", DateTime(2004, 9, 21)));
        return employeeList;
    }
    
    public void addRowToJTable(){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

        LocalDate nowDate = LocalDate.now();
        ArrayList<EmployeeData> employeeList = ListEmployee();
        Object rowData[] = new Object[5];
        for(int i = this.a; i < this.b;i++){
            LocalDate date = LocalDate.of(Integer.parseInt(employeeList.get(i).birthDay.split("-")[0]), Integer.parseInt(employeeList.get(i).birthDay.split("-")[1]), Integer.parseInt(employeeList.get(i).birthDay.split("-")[2]));
            rowData[0] = i+1;
            rowData[1] = employeeList.get(i).id;
            rowData[2] = employeeList.get(i).name;
            rowData[3] = date;
            Period period = Period.between(date, nowDate);
            rowData[4] = period.getYears()+" years "+period.getMonths()+" month "+period.getDays()+" day";
            model.addRow(rowData);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateNow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnPreviousPage = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNextPage = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateNow.setText("Date");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "ID", "NAME", "BIRTHDAY", "AGE"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPreviousPage.setText("<<");
        btnPreviousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousPageActionPerformed(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNextPage.setText(">>");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPreviousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateNow, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 379, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateNow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNextPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPreviousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousPageActionPerformed
        this.a = this.a - 5;
        this.b = this.b - 5;
        if(this.a <= 0){
            this.a = 0;
        }
        if(this.b <= 5){
            this.b = 5;
        }
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        addRowToJTable();
    }//GEN-LAST:event_btnPreviousPageActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.a = 0;
        this.b = 5;
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        addRowToJTable();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        this.a = this.a - 1;
        this.b = this.b - 1;
        if(this.a <= 0){
            this.a = 0;
        }
        if(this.b <= 5){
            this.b = 5;
        }
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        addRowToJTable();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        ArrayList<EmployeeData> employeeList = ListEmployee();
        this.a = this.a + 1;
        this.b = this.b + 1;
        if(this.a >= employeeList.size()){
            this.a = employeeList.size() - 5;
        }
        if(this.b >= employeeList.size()){
            this.b = employeeList.size();
        }
    DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        addRowToJTable();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
        ArrayList<EmployeeData> employeeList = ListEmployee();
        this.a = this.a + 5;
        this.b = this.b + 5;
        if(this.a >= employeeList.size()){
            this.a = employeeList.size() - 5;
        }
        if(this.b >= employeeList.size()){
            this.b = employeeList.size();
        }
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        addRowToJTable();
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        ArrayList<EmployeeData> employeeList = ListEmployee();
        this.a = employeeList.size()-5;
        this.b = employeeList.size();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        addRowToJTable();
    }//GEN-LAST:event_btnLastActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextPage;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPreviousPage;
    private javax.swing.JLabel dateNow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
