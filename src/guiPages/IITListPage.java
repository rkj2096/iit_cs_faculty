/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiPages;

/**
 *
 * @author Lenovo
 */
class Faculty {
    protected String name;
    protected String researchArea;
    protected String email;
    protected String webLink;
    Faculty(String name,String researchArea,String email,String webLink){
        this.name=name;
        this.researchArea=researchArea;
        this.email=email;
        this.webLink=webLink;
    }
}
public class IITListPage extends javax.swing.JFrame {

    /**
     * Creates new form IITListPage
     */
    public IITListPage() {
        initComponents();
        this.setIconImage(createImage("/images/IITR New Logo.jpg").getImage());
    }
    private javax.swing.ImageIcon createImage(String path){
        return new javax.swing.ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(path));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IITR New Logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(781, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("        IIT Kharagpur  Computer Science and Engineering Faculties Information");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 102, 255));
        jTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("        IIT Bombay  Computer Science and Engineering Faculties Information");
        jTextField2.setBorder(null);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 102, 255));
        jTextField3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("        IIT Kanpur  Computer Science and Engineering Faculties Information");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 102, 255));
        jTextField4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("        IIT Guwahati  Computer Science and Engineering Faculties Information");
        jTextField4.setBorder(null);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 102, 255));
        jTextField5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("        IIT Madras  Computer Science and Engineering Faculties Information");
        jTextField5.setBorder(null);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 102, 255));
        jTextField6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("        IIT Dehli  Computer Science and Engineering Faculties Information");
        jTextField6.setBorder(null);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // IIT Kharagpur
        String url="http://cse.iitkgp.ac.in/oldlook/faculty.html";
        try
        {
            org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).get();
            org.jsoup.select.Elements trs=doc.select("center > table > tbody > tr");
	    java.util.ArrayList<Faculty> faculty=new java.util.ArrayList<>();
            
	    for(int i=2;i<trs.size()-3;i+=2)
	    {
		    org.jsoup.select.Elements tds=trs.get(i).select("td");
		    String name=tds.get(1).text();
		    String email=tds.get(8).text()+"@cse.iitkgp.ernet.in";
		    String weblink=tds.get(10).select("a").attr("href");
		    String area=trs.get(i+1).select("i").text();
		    //System.out.println(name+"*"+mail+"*"+weblink+"*"+area);
                    faculty.add(new Faculty(name,area,email,weblink));
	    }
            showFacultyListPage(faculty,jTextField1.getText());
        }
        catch(java.io.IOException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Failed."+e,"SendMail",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField1MouseClicked
    private String email(String in){
	 
	StringBuilder mail=new StringBuilder(in);
	 int len=in.length();
	 int dot=len-2;
	 int dot1=len-4;
	 int dot2=len-8;
	 
	 if(mail.substring(len-11,len-8).equals("cse"))
	 {
	    mail.insert(dot,'.');
	    mail.insert(dot1,'.');
	    mail.insert(dot2,'.'); 
	    mail.insert(dot2-3,'@');
	 }
	 else if(mail.substring(len-10,len-8).equals("it"))
	 {
	    mail.insert(dot,'.');
	    mail.insert(dot1,'.');
	    mail.insert(dot2,'.'); 
	    mail.insert(dot2-2,'@');
	 }
         else if(mail.substring(len-10,len-8).equals("ur"))
	 {
	    mail.insert(dot,'.');
	    mail.insert(dot1,'.');
	    mail.insert(dot2,'@');
	    mail.insert(len-14,'.');
	 }
	 else 
	 {
	    mail.insert(dot,'.');
	    mail.insert(dot1,'.');
	    mail.insert(dot2,'@');
	 }
	 return mail.toString();
    }
    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // IIT Bombay
        String url="https://www.cse.iitb.ac.in/page14";
        jTextField2.setBackground(new java.awt.Color(0,51,255));
        try
        {
            java.util.ArrayList<Faculty> faculty=new java.util.ArrayList<>();
            org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).get();
            org.jsoup.select.Elements ele=doc.select("div.mpart > table").first().select("tbody > tr[class~=(row1|row2)]");
		for(org.jsoup.nodes.Element e:ele)
		{
			org.jsoup.select.Elements info = e.select("table > tbody > tr");
			if(info.size()==4) 
			{
				org.jsoup.select.Elements data = info.get(1).select("td");
				String webLink="https://www.cse.iitb.ac.in"+data.get(0).select("a").first().attr("href");
				String name=data.get(0).text();	
				String email=email(data.get(1).text());
				String area=" Not Availble";
                                faculty.add(new Faculty(name,area,email,webLink));
			}		
			else
			{
				org.jsoup.select.Elements data = info.get(1).select("td");
				String webLink="https://www.cse.iitb.ac.in"+data.get(0).select("a").first().attr("href");
				String name=data.get(0).text();	
				String email=email(data.get(1).text());
				org.jsoup.select.Elements data1 = info.get(2).select("td");
				String area=data1.get(0).text().split("Research Interests:")[1];
                                faculty.add(new Faculty(name,area,email,webLink));
			}
		}
                showFacultyListPage(faculty,jTextField2.getText());
        }
        catch(java.io.IOException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Failed"+e,"SendMail",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jTextField2MouseClicked
    
    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // IIT Knapur
        String url="http://www.iitk.ac.in/new/iitk-faculty";
        try
        {
                java.util.ArrayList<Faculty> faculty=new java.util.ArrayList<>();
		org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent("Mozilla/5.0").get();
		org.jsoup.select.Elements trs=doc.select("div#main > div.item-page > div > table > tbody > tr").get(1).select("td").get(3).select("div.facoverview > table > tbody > tr").get(2).select("td > div.jwts_toggleContent").get(4).select("div.jwts_content > table > tbody > tr");
		
		for(int i=1;i<trs.size();i++)
		{
			org.jsoup.nodes.Element td=trs.get(i).select("td").get(1).select("p").first();
			String data= td.text();
			
			String name=td.select("a").text();
			String email=data.substring(data.indexOf('(')+1,data.indexOf(')'));
                        email=email.contains("iitk.ac.in")?email.substring(0,email.indexOf('['))+"@"+email.substring(email.indexOf("]")+1):"Not Available";
			String weblink="http://www.iitk.ac.in/"+td.select("a").attr("href");
			String area=data.substring(data.indexOf(" Research Interests:")+19).equals("")?"Not Availble":data.substring(data.indexOf("Research Interests:")+19);
			//System.out.println(name+"*"+email+"*"+weblink+"*"+area);
                        faculty.add(new Faculty(name,area,email,weblink));
		}
                showFacultyListPage(faculty,jTextField3.getText());
        }
        catch(java.io.IOException e)
        {
           javax.swing.JOptionPane.showMessageDialog(null,"Failed"+e,"SendMail",javax.swing.JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // IIT Guwahati
        String url="http://www.iitg.ernet.in/cse/csefaculty";
        try
        {       java.util.ArrayList<Faculty> faculty=new java.util.ArrayList<>();
                org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent("Mozilla/5.0").get();
		org.jsoup.select.Elements trs=doc.select("div#content > div > table > tbody > tr");
		
		for(int i=0;i<trs.size();i++)
		{
			org.jsoup.select.Elements tds= trs.get(i).select("td");
			String data= tds.get(1).text();
			
			String name=tds.get(0).select("a").text();
			String area=data.substring(data.indexOf("Research Interests : ")+21,data.indexOf("eMail :"));
			String weblink=tds.get(0).select("a").attr("href");
			String email=data.substring(data.indexOf("eMail :")+7,data.indexOf("Phone")).replaceFirst(" @ ","@");
			//System.out.println(name+"*"+email+"*"+weblink+"*"+area);
                        faculty.add(new Faculty(name,area,email,weblink));
		}
                showFacultyListPage(faculty,jTextField4.getText());
        }
        catch(java.io.IOException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Failed"+e,"SendMail",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // IIT Madras
        String url="http://www.cse.iitm.ac.in/listpeople.php?arg=MSQw";
        try
        {
            java.util.ArrayList<Faculty> faculty=new java.util.ArrayList<>();
            org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent("Mozilla/5.0").get();
	    org.jsoup.select.Elements trs=doc.select("div#homepage > table > tbody > tr");
		
		for(int i=1;i<trs.size();i++)
		{
			org.jsoup.select.Elements tds= trs.get(i).select("td");
			//1 index
			String data= tds.get(1).text();
			
			String name=tds.get(1).select("a").text();
			String area=data.substring(data.indexOf("Research Interests : ")+21);
			String weblink="http://www.cse.iitm.ac.in/"+tds.get(1).select("a").attr("href");
			String email=data.substring(data.indexOf("Email : ")+8,data.indexOf("[")-1)+"@cse.iitm.ac.in";
                        faculty.add(new Faculty(name,area,email,weblink));
			//3 index
			data= tds.get(3).text();
			
			name=tds.get(3).select("a").text();
			area=data.substring(data.indexOf("Research Interests : ")+21);
			weblink="http://www.cse.iitm.ac.in/"+tds.get(3).select("a").attr("href");
			email=data.substring(data.indexOf("Email : ")+8,data.indexOf("[")-1)+"@cse.iitm.ac.in";
                        faculty.add(new Faculty(name,area,email,weblink));
		}
                showFacultyListPage(faculty,jTextField5.getText());
        }
        catch(java.io.IOException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Failed"+e,"SendMail",javax.swing.JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // IIT Dehli
        String url="http://www.cse.iitd.ernet.in/index.php/2011-12-29-23-14-30/faculty";
        try
        {   
                java.util.ArrayList<Faculty> faculty=new java.util.ArrayList<>();
                org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent("Mozilla/5.0").get();
		org.jsoup.select.Elements trs=doc.select("div#centercontent_bg > div > div > table > tbody > tr:not([align=center])");
		
                for(int i=0;i<trs.size();i++)
		{
			org.jsoup.select.Elements tds= trs.get(i).select("td");
			
			String name=tds.get(1).select("p").get(0).select("a").text();
			String area=tds.get(1).select("p").get(1).text();
			String weblink=tds.get(1).select("p").get(0).select("a").attr("href");
                        weblink= weblink.equals("/")?"Not Available":weblink;
			String email= tds.get(2).select("p").isEmpty()?tds.get(2).text():tds.get(2).select("p").get(0).text();
                        email=email.equals("")?"Not Available":email.replaceFirst(" AT ","@").substring(7).replaceAll("\u00A0", "").trim();
                        faculty.add(new Faculty(name,area,email,weblink)); 
		}
                showFacultyListPage(faculty,jTextField6.getText());
        }
        catch( java.io.IOException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Failed"+e,"SendMail",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed
    private void showFacultyListPage(java.util.ArrayList<Faculty> faculty,String iit){
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyListPage(faculty,iit).setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IITListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IITListPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}