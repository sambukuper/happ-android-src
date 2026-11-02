.class public abstract Ldu7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lkx4;Llp2;I)V
    .locals 9

    .line 1
    const v0, 0x48f172e9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p2

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    if-eq v2, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v1, 0x0

    .line 25
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Llp2;->N(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    sget v1, Ly46;->title_subscription:I

    .line 34
    .line 35
    invoke-static {v1, p1}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    shl-int/lit8 v0, v0, 0x3

    .line 40
    .line 41
    and-int/lit8 v7, v0, 0x70

    .line 42
    .line 43
    const/16 v8, 0xc

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    move-object v3, p0

    .line 48
    move-object v6, p1

    .line 49
    invoke-static/range {v2 .. v8}, Ldh3;->b(Ljava/lang/String;Lkx4;Ldn2;Lsn2;Llp2;II)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v3, p0

    .line 54
    move-object v6, p1

    .line 55
    invoke-virtual {v6}, Llp2;->Q()V

    .line 56
    .line 57
    .line 58
    :goto_2
    invoke-virtual {v6}, Llp2;->r()Lj86;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    new-instance p1, Lf80;

    .line 65
    .line 66
    const/4 v0, 0x5

    .line 67
    invoke-direct {p1, v3, p2, v0}, Lf80;-><init>(Lkx4;IB)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lj86;->d:Lrn2;

    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/util/Collection;)Let4;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {p1, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lt14;

    .line 32
    .line 33
    invoke-virtual {v1}, Lt14;->K()Let4;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v0}, Lz39;->A(Ljava/util/ArrayList;)Loc7;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget v0, p1, Loc7;->X:I

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eq v0, v1, :cond_1

    .line 52
    .line 53
    new-instance v0, Lyo0;

    .line 54
    .line 55
    new-array v2, v2, [Let4;

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Loc7;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, [Let4;

    .line 62
    .line 63
    invoke-direct {v0, p0, v2}, Lyo0;-><init>(Ljava/lang/String;[Let4;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {p1, v2}, Loc7;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    move-object v0, p0

    .line 72
    check-cast v0, Let4;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    sget-object v0, Ldt4;->b:Ldt4;

    .line 76
    .line 77
    :goto_1
    iget p0, p1, Loc7;->X:I

    .line 78
    .line 79
    if-gt p0, v1, :cond_3

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_3
    new-instance p0, Lp74;

    .line 83
    .line 84
    invoke-direct {p0, v0}, Lp74;-><init>(Let4;)V

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public static c(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    if-eq p0, v0, :cond_7

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eq p0, v1, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-eq p0, v2, :cond_5

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    if-eq p0, v0, :cond_4

    .line 21
    .line 22
    const/16 v0, 0x40

    .line 23
    .line 24
    if-eq p0, v0, :cond_3

    .line 25
    .line 26
    const/16 v0, 0x80

    .line 27
    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x100

    .line 31
    .line 32
    if-eq p0, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x200

    .line 35
    .line 36
    if-ne p0, v0, :cond_0

    .line 37
    .line 38
    const/16 p0, 0x9

    .line 39
    .line 40
    return p0

    .line 41
    :cond_0
    const-string v0, "type needs to be >= FIRST and <= LAST, type="

    .line 42
    .line 43
    invoke-static {p0, v0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_1
    return v1

    .line 53
    :cond_2
    const/4 p0, 0x7

    .line 54
    return p0

    .line 55
    :cond_3
    const/4 p0, 0x6

    .line 56
    return p0

    .line 57
    :cond_4
    const/4 p0, 0x5

    .line 58
    return p0

    .line 59
    :cond_5
    return v0

    .line 60
    :cond_6
    const/4 p0, 0x3

    .line 61
    return p0

    .line 62
    :cond_7
    return v1

    .line 63
    :cond_8
    return v0

    .line 64
    :cond_9
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static final d(C)Z
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gt v0, p0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x3a

    .line 7
    .line 8
    if-ge p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    return v1
.end method

.method public static final e(Lxd6;Lh48;Lh48;Lmj0;Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v3, Lmj0;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Lc15;

    .line 12
    .line 13
    iget v5, v4, Lc15;->Z:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-le v5, v6, :cond_0

    .line 17
    .line 18
    new-instance v7, Lu88;

    .line 19
    .line 20
    iget-object v3, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    iget-object v3, v2, Lh48;->Z:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v10

    .line 32
    iget-wide v11, v1, Lh48;->f0:J

    .line 33
    .line 34
    iget-wide v13, v2, Lh48;->f0:J

    .line 35
    .line 36
    const/16 v17, 0x0

    .line 37
    .line 38
    const/16 v18, 0x20

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const-wide/16 v15, 0x0

    .line 42
    .line 43
    invoke-direct/range {v7 .. v18}, Lu88;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZI)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v7}, Lxd6;->B(Lu88;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    if-ne v5, v6, :cond_2

    .line 51
    .line 52
    iget-object v4, v4, Lc15;->X:[Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    aget-object v4, v4, v5

    .line 56
    .line 57
    check-cast v4, Lgp0;

    .line 58
    .line 59
    iget v6, v4, Lgp0;->c:I

    .line 60
    .line 61
    iget v4, v4, Lgp0;->d:I

    .line 62
    .line 63
    invoke-static {v6, v4}, Lct7;->c(II)J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    iget-object v3, v3, Lmj0;->Y:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Lc15;

    .line 70
    .line 71
    iget-object v3, v3, Lc15;->X:[Ljava/lang/Object;

    .line 72
    .line 73
    aget-object v3, v3, v5

    .line 74
    .line 75
    check-cast v3, Lgp0;

    .line 76
    .line 77
    iget v4, v3, Lgp0;->a:I

    .line 78
    .line 79
    iget v3, v3, Lgp0;->b:I

    .line 80
    .line 81
    invoke-static {v4, v3}, Lct7;->c(II)J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    invoke-static {v6, v7}, Lf88;->b(J)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_1

    .line 90
    .line 91
    invoke-static {v3, v4}, Lf88;->b(J)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_2

    .line 96
    .line 97
    :cond_1
    new-instance v8, Lu88;

    .line 98
    .line 99
    invoke-static {v6, v7}, Lf88;->d(J)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-static {v6, v7}, Lf88;->d(J)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {v6, v7}, Lf88;->c(J)I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    iget-object v7, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 112
    .line 113
    invoke-interface {v7, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-static {v3, v4}, Lf88;->d(J)I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-static {v3, v4}, Lf88;->c(J)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    iget-object v4, v2, Lh48;->Z:Ljava/lang/CharSequence;

    .line 130
    .line 131
    invoke-interface {v4, v5, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    iget-wide v12, v1, Lh48;->f0:J

    .line 140
    .line 141
    iget-wide v14, v2, Lh48;->f0:J

    .line 142
    .line 143
    const-wide/16 v16, 0x0

    .line 144
    .line 145
    const/16 v19, 0x20

    .line 146
    .line 147
    move/from16 v18, p4

    .line 148
    .line 149
    invoke-direct/range {v8 .. v19}, Lu88;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZI)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v8}, Lxd6;->B(Lu88;)V

    .line 153
    .line 154
    .line 155
    :cond_2
    return-void
.end method

.method public static final f(ILjava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    add-int/2addr p0, v1

    .line 8
    if-lt v0, p0, :cond_6

    .line 9
    .line 10
    const-string p0, "+-"

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {p0, v2}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const/16 p0, 0x2d

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-static {p1, p0, v3, v2}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-ge p0, v1, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    move v2, v0

    .line 36
    :goto_0
    add-int/lit8 v4, v2, 0x1

    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/16 v6, 0x30

    .line 43
    .line 44
    if-ne v5, v6, :cond_2

    .line 45
    .line 46
    move v2, v4

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sub-int v2, p0, v2

    .line 49
    .line 50
    if-lt v2, v1, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    add-int/lit8 v1, p0, -0xa

    .line 54
    .line 55
    if-lt v1, v3, :cond_5

    .line 56
    .line 57
    if-ne v1, v3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_1

    .line 68
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    add-int/lit8 p0, p0, -0xb

    .line 75
    .line 76
    sub-int/2addr v4, p0

    .line 77
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1, v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-virtual {v2, p1, v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    move-object p0, v2

    .line 91
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_5
    const-string p0, "End index ("

    .line 97
    .line 98
    const-string p1, ") is less than start index (1)."

    .line 99
    .line 100
    invoke-static {p0, v1, p1}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lkp5;->k(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    return-object p0

    .line 109
    :cond_6
    :goto_2
    return-object p1
.end method
