import styles from "../CohortDetails.module.css";

function CohortDetails(props) {

    const { name, coach, trainer, startDate, status } = props.cohort;

    return (
        <div className={styles.box}>

            <h2>{name}</h2>

            <h3
                style={{
                    color: status === "ongoing" ? "green" : "blue"
                }}
            >
                {status}
            </h3>

            <dl>
                <dt>Coach</dt>
                <dd>{coach}</dd>

                <dt>Trainer</dt>
                <dd>{trainer}</dd>

                <dt>Start Date</dt>
                <dd>{startDate}</dd>
            </dl>

        </div>
    );
}

export default CohortDetails;