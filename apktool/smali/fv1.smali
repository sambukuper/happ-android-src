.class public final Lfv1;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;


# instance fields
.field public q0:Lt5;

.field public r0:Lrn2;

.field public s0:Lsd5;

.field public t0:Z


# virtual methods
.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 7

    .line 1
    invoke-interface {p2, p3, p4}, Ltr4;->o(J)Leo5;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lug3;->c0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lfv1;->t0:Z

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    :cond_0
    iget v0, p2, Leo5;->X:I

    .line 16
    .line 17
    iget v1, p2, Leo5;->Y:I

    .line 18
    .line 19
    int-to-long v2, v0

    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    shl-long/2addr v2, v0

    .line 23
    int-to-long v0, v1

    .line 24
    const-wide v4, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v0, v4

    .line 30
    or-long/2addr v0, v2

    .line 31
    iget-object v2, p0, Lfv1;->r0:Lrn2;

    .line 32
    .line 33
    new-instance v3, Lpf3;

    .line 34
    .line 35
    invoke-direct {v3, v0, v1}, Lpf3;-><init>(J)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lq31;

    .line 39
    .line 40
    invoke-direct {v0, p3, p4}, Lq31;-><init>(J)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2, v3, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Lqg5;

    .line 48
    .line 49
    iget-object p4, p0, Lfv1;->q0:Lt5;

    .line 50
    .line 51
    iget-object v0, p3, Lqg5;->X:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Llp4;

    .line 54
    .line 55
    iget-object p3, p3, Lqg5;->Y:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {p4}, Lt5;->d()Llp4;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v2, p4, Lt5;->m0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lrh5;

    .line 64
    .line 65
    invoke-static {v1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    iget-object v1, p4, Lt5;->n0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lrh5;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p4, Lt5;->g0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Llg3;

    .line 81
    .line 82
    iget-object v0, v0, Llg3;->b:Lq15;

    .line 83
    .line 84
    invoke-virtual {v0}, Lq15;->d()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    :try_start_0
    iget-object v4, p4, Lt5;->o0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, Lha;

    .line 94
    .line 95
    invoke-virtual {p4}, Lt5;->d()Llp4;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5, p3}, Llp4;->d(Ljava/lang/Object;)F

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_1

    .line 108
    .line 109
    iget-object v4, v4, Lha;->a:Lt5;

    .line 110
    .line 111
    iget-object v6, v4, Lt5;->k0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Lnh5;

    .line 114
    .line 115
    invoke-virtual {v6, v5}, Lnh5;->m(F)V

    .line 116
    .line 117
    .line 118
    iget-object v4, v4, Lt5;->l0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, Lnh5;

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-virtual {v4, v5}, Lnh5;->m(F)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :catchall_0
    move-exception p0

    .line 131
    goto :goto_1

    .line 132
    :cond_1
    :goto_0
    invoke-virtual {p4, p3}, Lt5;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v3}, Lq15;->m(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_1
    invoke-virtual {v0, v3}, Lq15;->m(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    throw p0

    .line 143
    :cond_2
    :goto_2
    if-nez v1, :cond_3

    .line 144
    .line 145
    invoke-virtual {v2, p3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    invoke-interface {p1}, Lug3;->c0()Z

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    if-nez p3, :cond_5

    .line 153
    .line 154
    iget-boolean p3, p0, Lfv1;->t0:Z

    .line 155
    .line 156
    if-eqz p3, :cond_4

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    const/4 p3, 0x0

    .line 160
    goto :goto_4

    .line 161
    :cond_5
    :goto_3
    const/4 p3, 0x1

    .line 162
    :goto_4
    iput-boolean p3, p0, Lfv1;->t0:Z

    .line 163
    .line 164
    iget p3, p2, Leo5;->X:I

    .line 165
    .line 166
    iget p4, p2, Leo5;->Y:I

    .line 167
    .line 168
    new-instance v0, Lsn;

    .line 169
    .line 170
    const/4 v1, 0x7

    .line 171
    invoke-direct {v0, p1, p0, p2, v1}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Le02;->X:Le02;

    .line 175
    .line 176
    invoke-interface {p1, p3, p4, p0, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0
.end method

.method public final R0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lfv1;->t0:Z

    .line 3
    .line 4
    return-void
.end method
