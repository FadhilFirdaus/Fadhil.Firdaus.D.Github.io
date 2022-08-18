function showStars(row: Int)
    Value j = 0
    value stars=""
    for i in 1 to row
        j = i
        stars = ""
        while j >= 1
            stars += "*"
            j -= 2
        end while
        print(stars)
    end for
end function