import { useNavigate } from 'react-router-dom'

const Home = () => {
    const navigate = useNavigate()

    return (
        <div>
            <h1>Home</h1>

            <button onClick={() => navigate('/tasks')}>
                Go to Tasks
            </button>
        </div>
    )
}

export default Home
