package array

type Node struct {
    v    int
    next *Node
}

func (n *Node) add(v int) *Node {
    node := &Node{}
    n.v = v
    n.next = node
    return node
}

func decrypt(code []int, k int) []int {
    arr := make([]int, len(code))
    sum := 0
    node := &Node{}
    tmp := node

    if k == 0 {
        return arr
    }
    for i, v := range code {
        if i == len(code)-1 {
            tmp.add(v)
            tmp.next = node
            break
        }
        tmp = tmp.add(v)
    }
    tmp = node
    if k > 0 {
        for i := 0; i <= k; i++ {
            if i != 0 {
                sum += tmp.v
            }
            tmp = tmp.next
        }
        for i, v := range code {
            if i == 0 {
                arr[i] = sum
                continue
            }
            sum += tmp.v
            sum -= v
            arr[i] = sum
            tmp = tmp.next
        }
    } else {
        k *= -1
        for i := 0; i < len(code)-k; i++ {
            tmp = tmp.next
        }
        node = tmp
        for i := 0; i < k; i++ {
            sum += tmp.v
            tmp = tmp.next
        }
        for i, _ := range code {
            if i == 0 {
                arr[i] = sum
                continue
            }
            sum += tmp.v
            sum -= node.v
            arr[i] = sum
            node = node.next
            tmp = tmp.next
        }
    }
    return arr
}
