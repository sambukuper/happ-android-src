.class public abstract Ly08;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lt14;Llh8;Ljava/util/Set;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Llh8;->x()Lot0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Lpt0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, Lpt0;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, v2

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Lpt0;->k0()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v0, v2

    .line 38
    :goto_1
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lwv0;->d1(Ljava/lang/Iterable;)Lgu;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    instance-of v1, p0, Ljava/util/Collection;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    move-object v1, p0

    .line 52
    check-cast v1, Ljava/util/Collection;

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_3
    invoke-virtual {p0}, Lgu;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :cond_4
    move-object v1, p0

    .line 66
    check-cast v1, Lrw1;

    .line 67
    .line 68
    iget-object v4, v1, Lrw1;->Y:Ljava/util/Iterator;

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_8

    .line 75
    .line 76
    invoke-virtual {v1}, Lrw1;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lpb3;

    .line 81
    .line 82
    iget v4, v1, Lpb3;->a:I

    .line 83
    .line 84
    iget-object v1, v1, Lpb3;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lni8;

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {v4, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Lhi8;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v4, v2

    .line 98
    :goto_2
    if-eqz v4, :cond_6

    .line 99
    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    invoke-virtual {v1}, Lni8;->c()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_7

    .line 114
    .line 115
    :goto_3
    move v1, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_7
    invoke-virtual {v1}, Lni8;->b()Lt14;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v1, p1, p2}, Ly08;->a(Lt14;Llh8;Ljava/util/Set;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    :goto_4
    if-eqz v1, :cond_4

    .line 129
    .line 130
    :goto_5
    const/4 p0, 0x1

    .line 131
    return p0

    .line 132
    :cond_8
    :goto_6
    return v3
.end method

.method public static final b(Lt14;Lrt8;Lhi8;)Lwg7;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwg7;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p2}, Lhi8;->D()Lrt8;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    :goto_0
    if-ne p2, p1, :cond_1

    .line 15
    .line 16
    sget-object p1, Lrt8;->Z:Lrt8;

    .line 17
    .line 18
    :cond_1
    invoke-direct {v0, p0, p1}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final c()J
    .locals 4

    .line 1
    sget-object v0, Lwe3;->a:Lmu0;

    .line 2
    .line 3
    invoke-interface {v0}, Lmu0;->a()Lte3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lte3;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x3e8

    .line 12
    .line 13
    div-long/2addr v0, v2

    .line 14
    return-wide v0
.end method

.method public static final d(Lt14;Laa7;Ljava/util/LinkedHashSet;Ljava/util/Set;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Llh8;->x()Lot0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lhi8;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Lt14;->n0()Llh8;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    check-cast v0, Lhi8;

    .line 32
    .line 33
    invoke-interface {v0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_9

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lt14;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v0, p1, p2, p3}, Ly08;->d(Lt14;Laa7;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Llh8;->x()Lot0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    instance-of v1, v0, Lpt0;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    check-cast v0, Lpt0;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move-object v0, v2

    .line 77
    :goto_1
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-interface {v0}, Lpt0;->k0()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v0, v2

    .line 85
    :goto_2
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const/4 v1, 0x0

    .line 94
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 v3, v1, 0x1

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Lni8;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-static {v1, v0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lhi8;

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    move-object v1, v2

    .line 118
    :goto_4
    if-eqz v1, :cond_5

    .line 119
    .line 120
    if-eqz p3, :cond_5

    .line 121
    .line 122
    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_5
    invoke-virtual {v4}, Lni8;->c()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_6
    invoke-virtual {v4}, Lni8;->b()Lt14;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Lt14;->n0()Llh8;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Llh8;->x()Lot0;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {p2, v1}, Lwv0;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_8

    .line 153
    .line 154
    invoke-virtual {v4}, Lni8;->b()Lt14;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Lt14;->n0()Llh8;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {p1}, Lt14;->n0()Llh8;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-static {v1, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_7

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    invoke-virtual {v4}, Lni8;->b()Lt14;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {v1, p1, p2, p3}, Ly08;->d(Lt14;Laa7;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    :goto_5
    move v1, v3

    .line 184
    goto :goto_3

    .line 185
    :cond_9
    return-void
.end method

.method public static final e(Lt14;)Lzz3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Llh8;->f()Lzz3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static final f(Lhi8;)Lt14;
    .locals 5

    .line 1
    invoke-interface {p0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v3, v1

    .line 34
    check-cast v3, Lt14;

    .line 35
    .line 36
    invoke-virtual {v3}, Lt14;->n0()Llh8;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3}, Llh8;->x()Lot0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    instance-of v4, v3, Lsx4;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    move-object v2, v3

    .line 49
    check-cast v2, Lsx4;

    .line 50
    .line 51
    :cond_1
    if-nez v2, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {v2}, Lsx4;->g0()Lus0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v4, Lus0;->Y:Lus0;

    .line 59
    .line 60
    if-eq v3, v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2}, Lsx4;->g0()Lus0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sget-object v3, Lus0;->g0:Lus0;

    .line 67
    .line 68
    if-eq v2, v3, :cond_0

    .line 69
    .line 70
    move-object v2, v1

    .line 71
    :cond_3
    check-cast v2, Lt14;

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    invoke-interface {p0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    check-cast p0, Lt14;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    return-object v2
.end method

.method public static final g(Lhi8;Llh8;Ljava/util/Set;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lt14;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Lot0;->X()Laa7;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lt14;->n0()Llh8;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v1, v2, p2}, Ly08;->a(Lt14;Llh8;Ljava/util/Set;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Lt14;->n0()Llh8;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    :cond_2
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static final h(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static final i(Lt14;Lt14;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lv14;->a:Lq45;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1}, Lq45;->b(Lt14;Lt14;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final j(Lt14;)Lmo8;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {p0, v0}, Lcj8;->g(Lt14;Z)Lmo8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public static final k(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.work.workdb"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    invoke-static {}, Llh4;->P0()Llh4;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lm39;->a:[Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v2, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lm39;->a:[Ljava/lang/String;

    .line 45
    .line 46
    array-length v0, p0

    .line 47
    invoke-static {v0}, Laq4;->G(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/16 v3, 0x10

    .line 52
    .line 53
    if-ge v0, v3, :cond_0

    .line 54
    .line 55
    move v0, v3

    .line 56
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 59
    .line 60
    .line 61
    array-length v0, p0

    .line 62
    const/4 v4, 0x0

    .line 63
    :goto_0
    if-ge v4, v0, :cond_1

    .line 64
    .line 65
    aget-object v5, p0, v4

    .line 66
    .line 67
    new-instance v6, Ljava/io/File;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-static {v7, v5}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v7, Ljava/io/File;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-static {v8, v5}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_2

    .line 104
    .line 105
    invoke-static {v1, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-direct {p0, v3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Ljava/util/Map$Entry;

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Ljava/io/File;

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/io/File;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_3

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_4

    .line 164
    .line 165
    invoke-static {}, Llh4;->P0()Llh4;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    sget-object v3, Lm39;->a:[Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    :cond_4
    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_5

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    :goto_3
    invoke-static {}, Llh4;->P0()Llh4;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sget-object v1, Lm39;->a:[Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_6
    return-void
.end method

.method public static l(Lqr6;Ljava/lang/String;)Lb18;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "PRAGMA table_info(`"

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v3, "`)"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :try_start_0
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 32
    .line 33
    .line 34
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const-string v9, "name"

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    :try_start_1
    sget-object v4, Le02;->X:Le02;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    invoke-static {v2, v10}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object v1, v0

    .line 50
    goto/16 :goto_c

    .line 51
    .line 52
    :cond_0
    :try_start_2
    invoke-static {v2, v9}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const-string v11, "type"

    .line 57
    .line 58
    invoke-static {v2, v11}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    const-string v12, "notnull"

    .line 63
    .line 64
    invoke-static {v2, v12}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    const-string v13, "pk"

    .line 69
    .line 70
    invoke-static {v2, v13}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    const-string v14, "dflt_value"

    .line 75
    .line 76
    invoke-static {v2, v14}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    new-instance v15, Lip4;

    .line 81
    .line 82
    invoke-direct {v15}, Lip4;-><init>()V

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-interface {v2, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v17

    .line 89
    invoke-interface {v2, v11}, Lxr6;->p0(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v18

    .line 93
    invoke-interface {v2, v12}, Lxr6;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v19

    .line 97
    cmp-long v16, v19, v7

    .line 98
    .line 99
    if-eqz v16, :cond_2

    .line 100
    .line 101
    const/16 v19, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const/16 v19, 0x0

    .line 105
    .line 106
    :goto_0
    invoke-interface {v2, v13}, Lxr6;->getLong(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    long-to-int v5, v5

    .line 111
    invoke-interface {v2, v14}, Lxr6;->isNull(I)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_3

    .line 116
    .line 117
    move-object/from16 v21, v10

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-interface {v2, v14}, Lxr6;->p0(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    move-object/from16 v21, v6

    .line 125
    .line 126
    :goto_1
    new-instance v16, Lx08;

    .line 127
    .line 128
    const/16 v22, 0x2

    .line 129
    .line 130
    move/from16 v20, v5

    .line 131
    .line 132
    invoke-direct/range {v16 .. v22}, Lx08;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    move-object/from16 v6, v16

    .line 136
    .line 137
    move-object/from16 v5, v17

    .line 138
    .line 139
    invoke-virtual {v15, v5, v6}, Lip4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-nez v5, :cond_1

    .line 147
    .line 148
    invoke-virtual {v15}, Lip4;->b()Lip4;

    .line 149
    .line 150
    .line 151
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    invoke-static {v2, v10}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v5, "PRAGMA foreign_key_list(`"

    .line 158
    .line 159
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-interface {v0, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    :try_start_3
    const-string v5, "id"

    .line 177
    .line 178
    invoke-static {v2, v5}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    const-string v6, "seq"

    .line 183
    .line 184
    invoke-static {v2, v6}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    const-string v11, "table"

    .line 189
    .line 190
    invoke-static {v2, v11}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    const-string v12, "on_delete"

    .line 195
    .line 196
    invoke-static {v2, v12}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    const-string v13, "on_update"

    .line 201
    .line 202
    invoke-static {v2, v13}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    invoke-static {v2}, Lvj8;->b0(Lxr6;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    invoke-interface {v2}, Lxr6;->reset()V

    .line 211
    .line 212
    .line 213
    new-instance v15, Lo57;

    .line 214
    .line 215
    invoke-direct {v15}, Lo57;-><init>()V

    .line 216
    .line 217
    .line 218
    :goto_3
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 219
    .line 220
    .line 221
    move-result v16

    .line 222
    if-eqz v16, :cond_8

    .line 223
    .line 224
    invoke-interface {v2, v6}, Lxr6;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v16

    .line 228
    cmp-long v16, v16, v7

    .line 229
    .line 230
    if-eqz v16, :cond_4

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_4
    invoke-interface {v2, v5}, Lxr6;->getLong(I)J

    .line 234
    .line 235
    .line 236
    move-result-wide v7

    .line 237
    long-to-int v7, v7

    .line 238
    new-instance v8, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    new-instance v10, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    move/from16 v19, v5

    .line 249
    .line 250
    new-instance v5, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v20

    .line 259
    :goto_4
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v21

    .line 263
    if-eqz v21, :cond_6

    .line 264
    .line 265
    move/from16 v21, v6

    .line 266
    .line 267
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    move-object/from16 v22, v14

    .line 272
    .line 273
    move-object v14, v6

    .line 274
    check-cast v14, Lmj2;

    .line 275
    .line 276
    iget v14, v14, Lmj2;->X:I

    .line 277
    .line 278
    if-ne v14, v7, :cond_5

    .line 279
    .line 280
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    :cond_5
    move/from16 v6, v21

    .line 284
    .line 285
    move-object/from16 v14, v22

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :catchall_1
    move-exception v0

    .line 289
    move-object v1, v0

    .line 290
    goto/16 :goto_b

    .line 291
    .line 292
    :cond_6
    move/from16 v21, v6

    .line 293
    .line 294
    move-object/from16 v22, v14

    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    if-eqz v6, :cond_7

    .line 305
    .line 306
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    check-cast v6, Lmj2;

    .line 311
    .line 312
    iget-object v7, v6, Lmj2;->Z:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    iget-object v6, v6, Lmj2;->f0:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_7
    new-instance v23, Lz08;

    .line 324
    .line 325
    invoke-interface {v2, v11}, Lxr6;->p0(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v24

    .line 329
    invoke-interface {v2, v12}, Lxr6;->p0(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v25

    .line 333
    invoke-interface {v2, v13}, Lxr6;->p0(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v26

    .line 337
    move-object/from16 v27, v8

    .line 338
    .line 339
    move-object/from16 v28, v10

    .line 340
    .line 341
    invoke-direct/range {v23 .. v28}, Lz08;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v5, v23

    .line 345
    .line 346
    invoke-virtual {v15, v5}, Lo57;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move/from16 v5, v19

    .line 350
    .line 351
    move/from16 v6, v21

    .line 352
    .line 353
    move-object/from16 v14, v22

    .line 354
    .line 355
    const-wide/16 v7, 0x0

    .line 356
    .line 357
    const/4 v10, 0x0

    .line 358
    goto/16 :goto_3

    .line 359
    .line 360
    :cond_8
    invoke-static {v15}, Lw45;->m(Lo57;)Lo57;

    .line 361
    .line 362
    .line 363
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 364
    const/4 v6, 0x0

    .line 365
    invoke-static {v2, v6}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    new-instance v2, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v6, "PRAGMA index_list(`"

    .line 371
    .line 372
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-interface {v0, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    :try_start_4
    invoke-static {v2, v9}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    const-string v6, "origin"

    .line 394
    .line 395
    invoke-static {v2, v6}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    const-string v7, "unique"

    .line 400
    .line 401
    invoke-static {v2, v7}, Lw45;->u(Lxr6;Ljava/lang/String;)I

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    const/4 v8, -0x1

    .line 406
    if-eq v3, v8, :cond_9

    .line 407
    .line 408
    if-eq v6, v8, :cond_9

    .line 409
    .line 410
    if-ne v7, v8, :cond_a

    .line 411
    .line 412
    :cond_9
    const/4 v6, 0x0

    .line 413
    goto :goto_8

    .line 414
    :cond_a
    new-instance v8, Lo57;

    .line 415
    .line 416
    invoke-direct {v8}, Lo57;-><init>()V

    .line 417
    .line 418
    .line 419
    :goto_6
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 420
    .line 421
    .line 422
    move-result v9

    .line 423
    if-eqz v9, :cond_e

    .line 424
    .line 425
    invoke-interface {v2, v6}, Lxr6;->p0(I)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    const-string v10, "c"

    .line 430
    .line 431
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    if-nez v9, :cond_b

    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_b
    invoke-interface {v2, v3}, Lxr6;->p0(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    invoke-interface {v2, v7}, Lxr6;->getLong(I)J

    .line 443
    .line 444
    .line 445
    move-result-wide v10

    .line 446
    const-wide/16 v12, 0x1

    .line 447
    .line 448
    cmp-long v10, v10, v12

    .line 449
    .line 450
    if-nez v10, :cond_c

    .line 451
    .line 452
    const/4 v10, 0x1

    .line 453
    goto :goto_7

    .line 454
    :cond_c
    const/4 v10, 0x0

    .line 455
    :goto_7
    invoke-static {v0, v9, v10}, Lvj8;->c0(Lqr6;Ljava/lang/String;Z)La18;

    .line 456
    .line 457
    .line 458
    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 459
    if-nez v9, :cond_d

    .line 460
    .line 461
    const/4 v10, 0x0

    .line 462
    invoke-static {v2, v10}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    const/4 v10, 0x0

    .line 466
    goto :goto_9

    .line 467
    :cond_d
    :try_start_5
    invoke-virtual {v8, v9}, Lo57;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    goto :goto_6

    .line 471
    :catchall_2
    move-exception v0

    .line 472
    move-object v1, v0

    .line 473
    goto :goto_a

    .line 474
    :cond_e
    invoke-static {v8}, Lw45;->m(Lo57;)Lo57;

    .line 475
    .line 476
    .line 477
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 478
    const/4 v6, 0x0

    .line 479
    invoke-static {v2, v6}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 480
    .line 481
    .line 482
    move-object v10, v0

    .line 483
    goto :goto_9

    .line 484
    :goto_8
    invoke-static {v2, v6}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 485
    .line 486
    .line 487
    move-object v10, v6

    .line 488
    :goto_9
    new-instance v0, Lb18;

    .line 489
    .line 490
    invoke-direct {v0, v1, v4, v5, v10}, Lb18;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 491
    .line 492
    .line 493
    return-object v0

    .line 494
    :goto_a
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 495
    :catchall_3
    move-exception v0

    .line 496
    invoke-static {v2, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 497
    .line 498
    .line 499
    throw v0

    .line 500
    :goto_b
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 501
    :catchall_4
    move-exception v0

    .line 502
    invoke-static {v2, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 503
    .line 504
    .line 505
    throw v0

    .line 506
    :goto_c
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 507
    :catchall_5
    move-exception v0

    .line 508
    invoke-static {v2, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 509
    .line 510
    .line 511
    throw v0
.end method

.method public static final m(Lt14;Lsm;)Lt14;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lsm;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Lsm;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lt14;->q0()Lmo8;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lt14;->m0()Lch8;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0, p1}, Lbt7;->i(Lch8;Lsm;)Lch8;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Lmo8;->t0(Lch8;)Lmo8;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final n(Lt14;)Lmo8;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->q0()Lmo8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lce2;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    check-cast v0, Lce2;

    .line 18
    .line 19
    iget-object v4, v0, Lce2;->Y:Laa7;

    .line 20
    .line 21
    invoke-virtual {v4}, Lt14;->n0()Llh8;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-interface {v5}, Llh8;->g()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    invoke-virtual {v4}, Lt14;->n0()Llh8;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {v5}, Llh8;->x()Lot0;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {v4}, Lt14;->n0()Llh8;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-interface {v5}, Llh8;->g()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-static {v5, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_1

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lhi8;

    .line 81
    .line 82
    new-instance v8, Lwg7;

    .line 83
    .line 84
    invoke-direct {v8, v7}, Lwg7;-><init>(Lhi8;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    invoke-static {v4, v6, v3, v1}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :cond_2
    :goto_1
    iget-object v0, v0, Lce2;->Z:Laa7;

    .line 96
    .line 97
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-interface {v5}, Llh8;->g()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-interface {v5}, Llh8;->x()Lot0;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-nez v5, :cond_3

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_3
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-interface {v5}, Llh8;->g()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v6, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-static {v5, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_4

    .line 151
    .line 152
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Lhi8;

    .line 157
    .line 158
    new-instance v7, Lwg7;

    .line 159
    .line 160
    invoke-direct {v7, v5}, Lwg7;-><init>(Lhi8;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    invoke-static {v0, v6, v3, v1}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_5
    :goto_3
    invoke-static {v4, v0}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    goto :goto_5

    .line 176
    :cond_6
    instance-of v0, p0, Laa7;

    .line 177
    .line 178
    if-eqz v0, :cond_a

    .line 179
    .line 180
    move-object v0, p0

    .line 181
    check-cast v0, Laa7;

    .line 182
    .line 183
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-interface {v4}, Llh8;->g()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_9

    .line 196
    .line 197
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-interface {v4}, Llh8;->x()Lot0;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-nez v4, :cond_7

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_7
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-interface {v4}, Llh8;->g()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v5, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-static {v4, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-eqz v4, :cond_8

    .line 237
    .line 238
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    check-cast v4, Lhi8;

    .line 243
    .line 244
    new-instance v6, Lwg7;

    .line 245
    .line 246
    invoke-direct {v6, v4}, Lwg7;-><init>(Lhi8;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_8
    invoke-static {v0, v5, v3, v1}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    :cond_9
    :goto_5
    invoke-static {v0, p0}, Lc18;->g(Lmo8;Lt14;)Lmo8;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :cond_a
    invoke-static {}, Lb61;->c()V

    .line 263
    .line 264
    .line 265
    return-object v3
.end method
