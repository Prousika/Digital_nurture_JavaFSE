import CohortDetails from "./Components/CohortDetails";

function App() {

  const cohorts = [
    {
      name: "React Bootcamp",
      coach: "Arun",
      trainer: "Priya",
      startDate: "01-Aug-2026",
      status: "ongoing"
    },
    {
      name: "Java Full Stack",
      coach: "Kumar",
      trainer: "Meena",
      startDate: "10-Jul-2026",
      status: "completed"
    },
    {
      name: "Python Basics",
      coach: "Rahul",
      trainer: "Divya",
      startDate: "15-Aug-2026",
      status: "ongoing"
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;