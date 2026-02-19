import { useEffect, useState } from 'react'

interface Task {
    id: number
    name: string
    completed: boolean
}

const Tasks = () => {
    const [tasks, setTasks] = useState<Task[]>([])
    const [loading, setLoading] = useState(true)

    useEffect(() => {
        fetch('http://localhost:8080/api/tasks')
            .then(res => res.json())
            .then(data => {
                setTasks(data)
                setLoading(false)
            })
            .catch(error => {
                console.error('Error fetching tasks:', error)
                setLoading(false)
            })
    }, []) // ← empty dependency array = run once on mount

    if (loading) return <p>Loading...</p>

    return (
        <div>
            <h1>Tasks</h1>
            <ol>
                {tasks.map(task => (
                    <li key={task.id}>
                        <strong>{task.name}</strong> ID: {task.id} Status: {task.completed ? "✅ Completed" : "⏳ Pending"}
                    </li>
                ))}
            </ol>
        </div>
    )
}

export default Tasks
