.class public final Lf55;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh55;


# virtual methods
.method public final c(Ljx4;)Z
    .locals 7

    .line 1
    const/4 p0, 0x0

    .line 2
    move-object v0, p0

    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    instance-of v2, p1, Lkq5;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast p1, Lkq5;

    .line 12
    .line 13
    invoke-interface {p1}, Lkq5;->P()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_6

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    iget v2, p1, Ljx4;->Z:I

    .line 21
    .line 22
    const/16 v4, 0x10

    .line 23
    .line 24
    and-int/2addr v2, v4

    .line 25
    if-eqz v2, :cond_6

    .line 26
    .line 27
    instance-of v2, p1, Loh1;

    .line 28
    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, Loh1;

    .line 33
    .line 34
    iget-object v2, v2, Loh1;->r0:Ljx4;

    .line 35
    .line 36
    move v5, v1

    .line 37
    :goto_1
    if-eqz v2, :cond_5

    .line 38
    .line 39
    iget v6, v2, Ljx4;->Z:I

    .line 40
    .line 41
    and-int/2addr v6, v4

    .line 42
    if-eqz v6, :cond_4

    .line 43
    .line 44
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    if-ne v5, v3, :cond_1

    .line 47
    .line 48
    move-object p1, v2

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    if-nez v0, :cond_2

    .line 51
    .line 52
    new-instance v0, Lc15;

    .line 53
    .line 54
    new-array v6, v4, [Ljx4;

    .line 55
    .line 56
    invoke-direct {v0, v1, v6}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lc15;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p1, p0

    .line 65
    :cond_3
    invoke-virtual {v0, v2}, Lc15;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_2
    iget-object v2, v2, Ljx4;->h0:Ljx4;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    if-ne v5, v3, :cond_6

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_6
    invoke-static {v0}, Lyn0;->T(Lc15;)Ljx4;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    goto :goto_0

    .line 79
    :cond_7
    return v1
.end method

.method public final e()I
    .locals 0

    .line 1
    const/16 p0, 0x10

    .line 2
    .line 3
    return p0
.end method

.method public final h(Landroidx/compose/ui/node/LayoutNode;JLq03;IZ)V
    .locals 0

    .line 1
    invoke-virtual/range {p1 .. p6}, Landroidx/compose/ui/node/LayoutNode;->D(JLq03;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l(Lq03;Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 8

    .line 1
    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui()Li55;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 p2, 0x10

    .line 9
    .line 10
    invoke-static {p2}, Lj55;->g(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Li55;->Y0(Z)Ljx4;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v0, 0x0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    iget-boolean v1, p0, Ljx4;->p0:Z

    .line 24
    .line 25
    if-eqz v1, :cond_a

    .line 26
    .line 27
    iget-object v1, p0, Ljx4;->X:Ljx4;

    .line 28
    .line 29
    iget-boolean v1, v1, Ljx4;->p0:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const-string v1, "visitLocalDescendants called on an unattached node"

    .line 34
    .line 35
    invoke-static {v1}, Lwc3;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p0, p0, Ljx4;->X:Ljx4;

    .line 39
    .line 40
    iget v1, p0, Ljx4;->f0:I

    .line 41
    .line 42
    and-int/2addr v1, p2

    .line 43
    if-eqz v1, :cond_a

    .line 44
    .line 45
    :goto_0
    if-eqz p0, :cond_a

    .line 46
    .line 47
    iget v1, p0, Ljx4;->Z:I

    .line 48
    .line 49
    and-int/2addr v1, p2

    .line 50
    if-eqz v1, :cond_9

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    move-object v2, p0

    .line 54
    move-object v3, v1

    .line 55
    :goto_1
    if-eqz v2, :cond_9

    .line 56
    .line 57
    instance-of v4, v2, Lkq5;

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    check-cast v2, Lkq5;

    .line 63
    .line 64
    invoke-interface {v2}, Lkq5;->B0()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_8

    .line 69
    .line 70
    iget-object p0, p1, Lq03;->X:Lj05;

    .line 71
    .line 72
    iget p0, p0, Lj05;->b:I

    .line 73
    .line 74
    sub-int/2addr p0, v5

    .line 75
    iput p0, p1, Lq03;->Z:I

    .line 76
    .line 77
    return v5

    .line 78
    :cond_2
    iget v4, v2, Ljx4;->Z:I

    .line 79
    .line 80
    and-int/2addr v4, p2

    .line 81
    if-eqz v4, :cond_8

    .line 82
    .line 83
    instance-of v4, v2, Loh1;

    .line 84
    .line 85
    if-eqz v4, :cond_8

    .line 86
    .line 87
    move-object v4, v2

    .line 88
    check-cast v4, Loh1;

    .line 89
    .line 90
    iget-object v4, v4, Loh1;->r0:Ljx4;

    .line 91
    .line 92
    move v6, v0

    .line 93
    :goto_2
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget v7, v4, Ljx4;->Z:I

    .line 96
    .line 97
    and-int/2addr v7, p2

    .line 98
    if-eqz v7, :cond_6

    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    if-ne v6, v5, :cond_3

    .line 103
    .line 104
    move-object v2, v4

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    if-nez v3, :cond_4

    .line 107
    .line 108
    new-instance v3, Lc15;

    .line 109
    .line 110
    new-array v7, p2, [Ljx4;

    .line 111
    .line 112
    invoke-direct {v3, v0, v7}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    if-eqz v2, :cond_5

    .line 116
    .line 117
    invoke-virtual {v3, v2}, Lc15;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v2, v1

    .line 121
    :cond_5
    invoke-virtual {v3, v4}, Lc15;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_3
    iget-object v4, v4, Ljx4;->h0:Ljx4;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    if-ne v6, v5, :cond_8

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_8
    invoke-static {v3}, Lyn0;->T(Lc15;)Ljx4;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    goto :goto_1

    .line 135
    :cond_9
    iget-object p0, p0, Ljx4;->h0:Ljx4;

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_a
    :goto_4
    return v0
.end method

.method public final n(Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
