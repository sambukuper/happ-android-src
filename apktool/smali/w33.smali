.class public final Lw33;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:[I

.field public b:[Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:I

.field public f:Lv33;


# virtual methods
.method public final declared-synchronized a(I)Ljava/lang/Object;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lw33;->c:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lw33;->a:[I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v2, v3, v0, p1}, Ljava/util/Arrays;->binarySearch([IIII)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ltz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lw33;->b:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object p1, v0, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    monitor-exit p0

    .line 24
    return-object v1

    .line 25
    :cond_1
    :try_start_1
    iget-object v0, p0, Lw33;->f:Lv33;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lw33;->b(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {v0, p1}, Lv33;->a(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-object v1

    .line 39
    :cond_2
    :goto_0
    :try_start_2
    instance-of v0, p1, Ljava/lang/ref/SoftReference;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p1, Ljava/lang/ref/SoftReference;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    :cond_3
    monitor-exit p0

    .line 50
    return-object p1

    .line 51
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    throw p1
.end method

.method public final b(I)I
    .locals 2

    .line 1
    ushr-int/lit8 v0, p1, 0x1c

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x5

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/16 v1, 0x9

    .line 14
    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    goto :goto_0

    .line 19
    :cond_2
    const/4 v0, 0x0

    .line 20
    :goto_0
    const v1, 0xfffffff

    .line 21
    .line 22
    .line 23
    and-int/2addr p1, v1

    .line 24
    iget p0, p0, Lw33;->d:I

    .line 25
    .line 26
    shl-int p0, v0, p0

    .line 27
    .line 28
    or-int/2addr p0, p1

    .line 29
    return p0
.end method

.method public final declared-synchronized c(IILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lw33;->c:I

    .line 3
    .line 4
    if-ltz v0, :cond_8

    .line 5
    .line 6
    iget-object v1, p0, Lw33;->a:[I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2, v0, p1}, Ljava/util/Arrays;->binarySearch([IIII)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ltz v0, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lw33;->b:[Ljava/lang/Object;

    .line 16
    .line 17
    aget-object p2, p1, v0

    .line 18
    .line 19
    instance-of v1, p2, Ljava/lang/ref/SoftReference;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    :goto_0
    move-object p3, p2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    check-cast p2, Ljava/lang/ref/SoftReference;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p2, Ljava/lang/ref/SoftReference;

    .line 35
    .line 36
    invoke-direct {p2, p3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    aput-object p2, p1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    :goto_1
    monitor-exit p0

    .line 42
    return-object p3

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_2
    :try_start_1
    iget v1, p0, Lw33;->c:I

    .line 47
    .line 48
    const/16 v3, 0x20

    .line 49
    .line 50
    if-ge v1, v3, :cond_6

    .line 51
    .line 52
    not-int v0, v0

    .line 53
    if-ge v0, v1, :cond_3

    .line 54
    .line 55
    iget-object v3, p0, Lw33;->a:[I

    .line 56
    .line 57
    add-int/lit8 v4, v0, 0x1

    .line 58
    .line 59
    sub-int/2addr v1, v0

    .line 60
    invoke-static {v3, v0, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lw33;->b:[Ljava/lang/Object;

    .line 64
    .line 65
    iget v3, p0, Lw33;->c:I

    .line 66
    .line 67
    sub-int/2addr v3, v0

    .line 68
    invoke-static {v1, v0, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 69
    .line 70
    .line 71
    :cond_3
    iget v1, p0, Lw33;->c:I

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    add-int/2addr v1, v3

    .line 75
    iput v1, p0, Lw33;->c:I

    .line 76
    .line 77
    iget-object v1, p0, Lw33;->a:[I

    .line 78
    .line 79
    aput p1, v1, v0

    .line 80
    .line 81
    iget-object p1, p0, Lw33;->b:[Ljava/lang/Object;

    .line 82
    .line 83
    const/16 v1, 0x18

    .line 84
    .line 85
    if-lt p2, v1, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move v2, v3

    .line 89
    :goto_2
    if-eqz v2, :cond_5

    .line 90
    .line 91
    move-object p2, p3

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    new-instance p2, Ljava/lang/ref/SoftReference;

    .line 94
    .line 95
    invoke-direct {p2, p3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :goto_3
    aput-object p2, p1, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    .line 100
    monitor-exit p0

    .line 101
    return-object p3

    .line 102
    :cond_6
    :try_start_2
    new-instance v0, Lv33;

    .line 103
    .line 104
    iget v1, p0, Lw33;->e:I

    .line 105
    .line 106
    invoke-direct {v0, v1, v2}, Lv33;-><init>(II)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Lw33;->f:Lv33;

    .line 110
    .line 111
    move v0, v2

    .line 112
    :goto_4
    if-ge v0, v3, :cond_7

    .line 113
    .line 114
    iget-object v1, p0, Lw33;->f:Lv33;

    .line 115
    .line 116
    iget-object v4, p0, Lw33;->a:[I

    .line 117
    .line 118
    aget v4, v4, v0

    .line 119
    .line 120
    invoke-virtual {p0, v4}, Lw33;->b(I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    iget-object v5, p0, Lw33;->b:[Ljava/lang/Object;

    .line 125
    .line 126
    aget-object v5, v5, v0

    .line 127
    .line 128
    invoke-virtual {v1, v4, v2, v5}, Lv33;->b(IILjava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Lw33;->a:[I

    .line 136
    .line 137
    iput-object v0, p0, Lw33;->b:[Ljava/lang/Object;

    .line 138
    .line 139
    const/4 v0, -0x1

    .line 140
    iput v0, p0, Lw33;->c:I

    .line 141
    .line 142
    :cond_8
    iget-object v0, p0, Lw33;->f:Lv33;

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Lw33;->b(I)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-virtual {v0, p1, p2, p3}, Lv33;->b(IILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    monitor-exit p0

    .line 153
    return-object p1

    .line 154
    :goto_5
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    throw p1
.end method
