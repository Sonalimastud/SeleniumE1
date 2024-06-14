package Factsheet;
import javax.swing.*;
import java.awt.*;

public class SalezsharkConnectPlus extends JFrame {

    public SalezsharkConnectPlus() {
        setTitle("Salezshark Connect+");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top Bar
        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topBar.setBackground(Color.WHITE);

        JLabel logo = new JLabel("Salezshark Connect+");
        logo.setFont(new Font("Arial", Font.BOLD, 20));
        topBar.add(logo, BorderLayout.WEST);

        JTextField searchField = new JTextField("Type here to search...");
        topBar.add(searchField, BorderLayout.CENTER);

        JPanel userInfo = new JPanel();
        userInfo.setBackground(Color.WHITE);
        userInfo.add(new JLabel(new ImageIcon("user-icon.png")));
        topBar.add(userInfo, BorderLayout.EAST);

        add(topBar, BorderLayout.NORTH);

        // Main Content
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Sidebar
        JPanel sidebar = new JPanel(new GridLayout(0, 1));
        sidebar.setBackground(new Color(51, 51, 51));
        sidebar.setPreferredSize(new Dimension(200, getHeight()));
        String[] menuItems = {"Dashboard", "Prospect", "Connect", "Automation"};
        for (String item : menuItems) {
            JButton button = new JButton(item);
            button.setForeground(Color.WHITE);
            button.setBackground(new Color(51, 51, 51));
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setHorizontalAlignment(SwingConstants.LEFT);
            sidebar.add(button);
        }
        mainPanel.add(sidebar, BorderLayout.WEST);

        // Content
        JPanel content = new JPanel(new GridLayout(3, 1));
        content.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Welcome Section
        JPanel welcomeSection = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Today is Wednesday, Jun 2024", JLabel.LEFT);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        welcomeSection.add(welcomeLabel, BorderLayout.NORTH);

        JPanel profilePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        profilePanel.add(new JLabel(new ImageIcon("profile-icon.png")));
        profilePanel.add(new JLabel("factsheet@gmail.com"));
        welcomeSection.add(profilePanel, BorderLayout.CENTER);

        JPanel onboardingPanel = new JPanel(new BorderLayout());
        onboardingPanel.add(new JLabel("Onboarding Setup"), BorderLayout.NORTH);
        JProgressBar onboardingProgress = new JProgressBar(0, 100);
        onboardingProgress.setValue(25);
        onboardingPanel.add(onboardingProgress, BorderLayout.CENTER);
        welcomeSection.add(onboardingPanel, BorderLayout.SOUTH);

        content.add(welcomeSection);

        // Actions Section
        JPanel actionsPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        actionsPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        String[] actionTitles = {
                "Import / Sync Data",
                "Domain / SMTP Configuration",
                "Install Chrome Extension",
                "Prospect List"
        };
        String[] actionDescriptions = {
                "Syncs your contacts from Gmail, Microsoft 365, etc",
                "Setup your domain for sending campaigns",
                "Get verified leads directly from the LinkedIn extension",
                "Create your own executive's list and send campaign"
        };
        for (int i = 0; i < actionTitles.length; i++) {
            JPanel actionItem = new JPanel(new BorderLayout());
            actionItem.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            actionItem.add(new JLabel(actionTitles[i]), BorderLayout.NORTH);
            actionItem.add(new JLabel(actionDescriptions[i]), BorderLayout.CENTER);
            actionsPanel.add(actionItem);
        }
        content.add(actionsPanel);

        // Explore Section
        JPanel explorePanel = new JPanel(new GridLayout(1, 3, 10, 10));
        explorePanel.setBorder(BorderFactory.createTitledBorder("Explore Connect+ Features"));
        String[] exploreTitles = {"Email Campaigns", "Templates", "List"};
        String[] exploreDescriptions = {
                "Create your email campaign & track all its performances.",
                "Choose from the inbuilt gallery or create your own.",
                "Create the static or active list by importing contacts and send campaigns."
        };
        for (int i = 0; i < exploreTitles.length; i++) {
            JPanel exploreItem = new JPanel(new BorderLayout());
            exploreItem.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            exploreItem.add(new JLabel(exploreTitles[i]), BorderLayout.NORTH);
            exploreItem.add(new JLabel(exploreDescriptions[i]), BorderLayout.CENTER);
            explorePanel.add(exploreItem);
        }
        content.add(explorePanel);

        mainPanel.add(content, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        // Footer
        JPanel footer = new JPanel(new BorderLayout());
        footer.setBackground(new Color(248, 248, 248));
        footer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        footer.add(new JLabel("Need some assistance? Our support team is ready to help."), BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalezsharkConnectPlus frame = new SalezsharkConnectPlus();
            frame.setVisible(true);
        });
    }
}
