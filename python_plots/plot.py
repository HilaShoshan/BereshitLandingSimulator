import matplotlib.pyplot as plt


time = []  # index 0
vs = []  # index 1
hs = []  # index 2
dist = []  # index 3
alt = []  # index 4
ang = []  # index 5
weight = []  # index 6
acc = []  # index 7


def read_file(filename):
    with open(filename) as topo_file:
        for line in topo_file:
            splitted = line.split(",")
            time.append(float(splitted[0]))
            vs.append(float(splitted[1]))
            hs.append(float(splitted[2]))
            dist.append(float(splitted[3]))
            alt.append(float(splitted[4]))
            ang.append(float(splitted[5]))
            weight.append(float(splitted[6]))
            acc.append(float(splitted[7]))


def plot():
    # Initialise the subplot function using number of rows and columns
    fig, axis = plt.subplots(2, 4)
    fig.tight_layout()

    axis[0, 0].plot(time, vs)
    axis[0, 0].set_title("vertical speed")

    axis[0, 1].plot(time, hs)
    axis[0, 1].set_title("horizontal speed")

    axis[0, 2].plot(time, dist)
    axis[0, 2].set_title("distance")

    axis[0, 3].plot(time, alt)
    axis[0, 3].set_title("altitude")

    axis[1, 0].plot(time, ang)
    axis[1, 0].set_title("angle")

    axis[1, 1].plot(time, weight)
    axis[1, 1].set_title("weight")

    axis[1, 2].plot(time, acc)
    axis[1, 2].set_title("acceleration")

    # Combine all the operations, display and save it
    plt.savefig('new.png')
    plt.show()


def main():
    filename = "..\\new.txt"
    read_file(filename)
    plot()


if __name__ == "__main__":
    main()