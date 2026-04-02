# ⚡ GrindOS — Productivity Tick Game

A dark-themed, gamified daily productivity tracker with XP system, streaks, and monthly history.

---

## 🚀 Features

- **Login / Signup** with JWT auth
- **19 daily mission slots** matched to your timetable
- **XP system** — earn up to 164 XP/day; level up over time
- **Streak tracking** — consecutive days with ≥50% completion
- **30-day calendar** — color-coded heat map of your performance
- **Click any day** to see full slot breakdown
- **Monthly History** — after a month ends, see "Apr '26", "Mar '26" cards with stats

---

## 🍃 Step 1 — MongoDB Atlas Setup

### 1.1 Create Account
1. Go to **https://cloud.mongodb.com** and sign up (free)
2. Click **"Build a Database"** → choose **M0 Free Tier**
3. Choose a cloud provider (AWS) and region close to you (Mumbai for India)
4. Click **"Create"**

### 1.2 Create Database User
1. In the left sidebar → **Database Access**
2. Click **"Add New Database User"**
3. Choose **"Password"** authentication
4. Set Username: `grindos_user`
5. Set a strong password (save it!)
6. Under **"Database User Privileges"** → select **"Read and write to any database"**
7. Click **"Add User"**

### 1.3 Whitelist Your IP
1. In the left sidebar → **Network Access**
2. Click **"Add IP Address"**
3. For development: click **"Add Current IP Address"**
4. For production (Render): click **"Allow Access from Anywhere"** → `0.0.0.0/0`
5. Click **"Confirm"**

### 1.4 Get Your Connection String
1. Go to **Database** in sidebar → click **"Connect"** on your cluster
2. Choose **"Drivers"**
3. Select Driver: **Node.js**, Version: **5.5 or later**
4. Copy the connection string — it looks like:
   ```
   mongodb+srv://grindos_user:<password>@cluster0.xxxxx.mongodb.net/?retryWrites=true&w=majority
   ```
5. Replace `<password>` with your actual password
6. Add database name before `?`:
   ```
   mongodb+srv://grindos_user:yourpass@cluster0.xxxxx.mongodb.net/grindos?retryWrites=true&w=majority
   ```

---

## ⚙️ Step 2 — Local Development

### 2.1 Clone & Install
```bash
git clone <your-repo>
cd productivity-tracker
npm install        # installs server deps + triggers client install
```

### 2.2 Create .env file
```bash
cp .env.example .env
```
Edit `.env`:
```env
MONGO_URI=mongodb+srv://grindos_user:yourpass@cluster0.xxxxx.mongodb.net/grindos?retryWrites=true&w=majority
JWT_SECRET=pick_any_long_random_string_like_this_abc123xyz789
PORT=5000
NODE_ENV=development
```

### 2.3 Run in development
```bash
npm run dev
```
This starts:
- Express API on `http://localhost:5000`
- Vite dev server on `http://localhost:5173`

Open `http://localhost:5173` in your browser.

---

## 🌐 Step 3 — Deploy to Render (Free)

### 3.1 Push to GitHub
```bash
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/yourusername/productivity-tracker.git
git push -u origin main
```

### 3.2 Create Web Service on Render
1. Go to **https://render.com** → Sign up / Login
2. Click **"New +"** → **"Web Service"**
3. Connect your GitHub repo
4. Fill in settings:
   - **Name**: `grindos`
   - **Root Directory**: leave blank
   - **Runtime**: `Node`
   - **Build Command**: `npm install && npm run build`
   - **Start Command**: `npm start`
5. Click **"Advanced"** → **"Add Environment Variable"** for each:
   - `MONGO_URI` = your Atlas connection string
   - `JWT_SECRET` = your random secret
   - `NODE_ENV` = `production`
   - `PORT` = `5000`
6. Click **"Create Web Service"**

Render will build and deploy. Your app will be live at `https://grindos.onrender.com` (or similar).

> ⚠️ **Free tier note**: Render free services sleep after 15 mins of inactivity. First request after sleep takes ~30s. Upgrade to paid ($7/mo) for always-on.

---

## 📁 Project Structure

```
productivity-tracker/
├── server/
│   ├── index.js              # Express entry point
│   ├── data/slots.js         # 19 daily slots definition
│   ├── models/
│   │   ├── User.js           # User schema
│   │   └── DayRecord.js      # Daily record schema
│   ├── routes/
│   │   ├── auth.js           # Login/register/me
│   │   └── records.js        # Day/month/history/toggle/streak
│   └── middleware/
│       └── authMiddleware.js # JWT protect
├── client/
│   ├── index.html
│   ├── vite.config.js
│   └── src/
│       ├── App.jsx           # Routes
│       ├── index.css         # All styles
│       ├── context/AuthContext.jsx
│       ├── api/axios.js
│       ├── data/slots.js     # Client slot data + helpers
│       ├── pages/
│       │   ├── Login.jsx
│       │   ├── Signup.jsx
│       │   ├── Dashboard.jsx
│       │   └── History.jsx
│       └── components/
│           ├── Navbar.jsx
│           ├── SlotCard.jsx
│           ├── DayGrid.jsx
│           ├── XPBar.jsx
│           ├── DayModal.jsx
│           └── ProtectedRoute.jsx
├── package.json              # Root (server + scripts)
├── .env.example
└── README.md
```

---

## 🎮 XP System

| Slot Type | XP |
|-----------|-----|
| Job Slot 1 & 2 | 15 each |
| DSA Session 1 & 2 | 15 each |
| Deep Learning | 12 |
| Project Work | 12 |
| Interview Practice | 12 |
| Testing | 10 |
| LinkedIn/Resume | 8 |
| Gym/Play | 8 |
| Morning/Evening routines | 5 each |
| Breaks & Chill | 3 each |
| **Total per day** | **164 XP** |

## 🏅 Levels

| Level | Title | XP Required |
|-------|-------|-------------|
| 1 | Rookie | 0 |
| 2 | Focused | 500 |
| 3 | Dedicated | 1,500 |
| 4 | Consistent | 3,000 |
| 5 | Elite | 5,000 |
| 6 | Legend | 8,000 |

---

## 🛠 Tech Stack

- **Backend**: Node.js, Express, Mongoose, JWT, bcryptjs
- **Frontend**: React 18, Vite, React Router v6
- **Database**: MongoDB Atlas
- **Fonts**: Rajdhani, Space Mono, DM Sans
- **Deploy**: Render.com (backend + frontend served together)
