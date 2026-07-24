# Week 7 - Git Hands-on

## Objective
Learn and practice basic Git commands.

## Commands Executed

### Check Git Version
```bash
git --version
```

### Configure Username
```bash
git config --global user.name "Your Name"
```

### Configure Email
```bash
git config --global user.email "youremail@example.com"
```

### Verify Configuration
```bash
git config --global --list
```

### Create Repository
```bash
mkdir GitDemo
cd GitDemo
git init
```

### Check Repository Status
```bash
git status
```

### Create File
```bash
echo Welcome to Git > welcome.txt
```

### Add File
```bash
git add welcome.txt
```

### Commit
```bash
git commit -m "Added welcome.txt"
```

### Connect Remote Repository
```bash
git remote add origin https://github.com/yourusername/GitDemo.git
```

### Pull Changes
```bash
git pull origin main
```

### Push Changes
```bash
git push origin main
```

## Files
- welcome.txt

## Status
Week 7 Git assignment completed.