import './App.css'
import Tasks from './pages/Tasks'
import Home from './pages/Home'
import {Routes, Route} from 'react-router-dom'

function App() {

  return (

    <>
        <Routes>
            <Route path = "/" element={< Home/>}/>
            <Route path = "/api/tasks" element={<Tasks />}/>
        </Routes>
    </>
  )
}

export default App
