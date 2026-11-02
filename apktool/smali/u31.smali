.class public final Lu31;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lab7;
.implements Lix4;


# instance fields
.field public X:J

.field public Y:Ljava/util/ArrayList;


# virtual methods
.method public final a(Lq51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lt31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lt31;

    .line 7
    .line 8
    iget v1, v0, Lt31;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lt31;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lt31;

    .line 21
    .line 22
    check-cast p1, Ls51;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lt31;-><init>(Lu31;Ls51;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, Lt31;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lt31;->i0:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget-object v0, v0, Lt31;->f0:Lea6;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-wide v3, p0, Lu31;->X:J

    .line 55
    .line 56
    invoke-static {v3, v4}, Lq31;->k(J)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    new-instance p1, Lea6;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    :try_start_1
    iput-object p1, v0, Lt31;->f0:Lea6;

    .line 68
    .line 69
    iput v2, v0, Lt31;->i0:I

    .line 70
    .line 71
    new-instance v1, Lmm0;

    .line 72
    .line 73
    invoke-static {v0}, Lmb6;->H(Lq51;)Lq51;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {v1, v2, v0}, Lmm0;-><init>(ILq51;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lmm0;->s()V

    .line 81
    .line 82
    .line 83
    iput-object v1, p1, Lea6;->X:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v0, p0, Lu31;->Y:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lmm0;->q()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    sget-object v1, Lc71;->X:Lc71;

    .line 95
    .line 96
    if-ne v0, v1, :cond_3

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_3
    move-object v0, p1

    .line 100
    :goto_1
    iget-object p1, p0, Lu31;->Y:Ljava/util/ArrayList;

    .line 101
    .line 102
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {p1}, Lci8;->d(Ljava/lang/Object;)Ljava/util/Collection;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    move-object v5, v0

    .line 114
    move-object v0, p1

    .line 115
    move-object p1, v5

    .line 116
    :goto_2
    iget-object p0, p0, Lu31;->Y:Ljava/util/ArrayList;

    .line 117
    .line 118
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {p0}, Lci8;->d(Ljava/lang/Object;)Ljava/util/Collection;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-interface {p0, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_4
    :goto_3
    iget-wide p0, p0, Lu31;->X:J

    .line 129
    .line 130
    new-instance v0, Lta7;

    .line 131
    .line 132
    invoke-static {p0, p1}, Lq31;->h(J)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    sget-object v2, Lxo1;->a:Lxo1;

    .line 137
    .line 138
    const v3, 0x7fffffff

    .line 139
    .line 140
    .line 141
    if-eq v1, v3, :cond_5

    .line 142
    .line 143
    invoke-static {v1}, Lwo1;->a(I)V

    .line 144
    .line 145
    .line 146
    new-instance v4, Lwo1;

    .line 147
    .line 148
    invoke-direct {v4, v1}, Lwo1;-><init>(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_5
    move-object v4, v2

    .line 153
    :goto_4
    invoke-static {p0, p1}, Lq31;->g(J)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eq p0, v3, :cond_6

    .line 158
    .line 159
    invoke-static {p0}, Lwo1;->a(I)V

    .line 160
    .line 161
    .line 162
    new-instance v2, Lwo1;

    .line 163
    .line 164
    invoke-direct {v2, p0}, Lwo1;-><init>(I)V

    .line 165
    .line 166
    .line 167
    :cond_6
    invoke-direct {v0, v4, v2}, Lta7;-><init>(Lyo1;Lyo1;)V

    .line 168
    .line 169
    .line 170
    return-object v0
.end method

.method public final c(Lzr4;Ltr4;J)Lyr4;
    .locals 1

    .line 1
    invoke-virtual {p0, p3, p4}, Lu31;->e(J)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p3, p4}, Ltr4;->o(J)Leo5;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget p2, p0, Leo5;->X:I

    .line 9
    .line 10
    iget p3, p0, Leo5;->Y:I

    .line 11
    .line 12
    new-instance p4, Ld1;

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-direct {p4, p0, v0}, Ld1;-><init>(Leo5;B)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Le02;->X:Le02;

    .line 19
    .line 20
    invoke-interface {p1, p2, p3, p0, p4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final e(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lu31;->X:J

    .line 2
    .line 3
    invoke-static {p1, p2}, Lq31;->k(J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lu31;->Y:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    new-instance p2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lu31;->Y:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lq51;

    .line 39
    .line 40
    sget-object p2, Ldn8;->a:Ldn8;

    .line 41
    .line 42
    invoke-interface {p1, p2}, Lq51;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
.end method
