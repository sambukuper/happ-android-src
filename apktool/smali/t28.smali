.class public final Lt28;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;
.implements Lrv1;
.implements Lw07;


# instance fields
.field public A0:Lfw0;

.field public B0:Lmx;

.field public C0:Lgn2;

.field public D0:Ljava/util/Map;

.field public E0:Lez4;

.field public F0:Lr28;

.field public G0:Ls28;

.field public q0:Lql;

.field public r0:Lo88;

.field public s0:Lfi2;

.field public t0:Lgn2;

.field public u0:I

.field public v0:Z

.field public w0:I

.field public x0:I

.field public y0:Ljava/util/List;

.field public z0:Lgn2;


# virtual methods
.method public final J0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt28;->Z0(Lfi1;)Lez4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p3, p1}, Lez4;->a(ILz24;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final K(Lzr4;Ltr4;J)Lyr4;
    .locals 4

    .line 1
    const-string v0, "TextAnnotatedStringNode:measure"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lt28;->Z0(Lfi1;)Lez4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p3, p4, v1}, Lez4;->c(JLz24;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    iget-object p4, v0, Lez4;->o:Lx78;

    .line 19
    .line 20
    if-eqz p4, :cond_4

    .line 21
    .line 22
    iget-wide v0, p4, Lx78;->c:J

    .line 23
    .line 24
    iget-object v2, p4, Lx78;->b:Lbz4;

    .line 25
    .line 26
    iget-object v2, v2, Lbz4;->a:Ly5;

    .line 27
    .line 28
    invoke-virtual {v2}, Ly5;->b()Z

    .line 29
    .line 30
    .line 31
    if-eqz p3, :cond_2

    .line 32
    .line 33
    const/4 p3, 0x2

    .line 34
    invoke-static {p0, p3}, Lyn0;->X(Lnh1;I)Li55;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Li55;->d1()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lt28;->t0:Lgn2;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v2, p4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v2, p0, Lt28;->D0:Ljava/util/Map;

    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-direct {v2, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    sget-object p3, Lu8;->a:Lt03;

    .line 58
    .line 59
    iget v3, p4, Lx78;->d:F

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p3, Lu8;->b:Lt03;

    .line 73
    .line 74
    iget v3, p4, Lx78;->e:F

    .line 75
    .line 76
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lt28;->D0:Ljava/util/Map;

    .line 88
    .line 89
    :cond_2
    iget-object p3, p0, Lt28;->z0:Lgn2;

    .line 90
    .line 91
    if-eqz p3, :cond_3

    .line 92
    .line 93
    iget-object p4, p4, Lx78;->f:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-interface {p3, p4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_3
    const/16 p3, 0x20

    .line 99
    .line 100
    shr-long p3, v0, p3

    .line 101
    .line 102
    long-to-int p3, p3

    .line 103
    const-wide v2, 0xffffffffL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    and-long/2addr v0, v2

    .line 109
    long-to-int p4, v0

    .line 110
    invoke-static {p3, p3, p4, p4}, Lz68;->B(IIII)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    invoke-interface {p2, v0, v1}, Ltr4;->o(J)Leo5;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iget-object p0, p0, Lt28;->D0:Ljava/util/Map;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v0, Ld1;

    .line 124
    .line 125
    const/16 v1, 0xd

    .line 126
    .line 127
    invoke-direct {v0, p2, v1}, Ld1;-><init>(Leo5;B)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p1, p3, p4, p0, v0}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 131
    .line 132
    .line 133
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 135
    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_4
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    new-instance p1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string p2, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "

    .line 143
    .line 144
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    :catchall_0
    move-exception p0

    .line 159
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 160
    .line 161
    .line 162
    throw p0
.end method

.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Y0()Lez4;
    .locals 11

    .line 1
    iget-object v0, p0, Lt28;->E0:Lez4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lez4;

    .line 6
    .line 7
    iget-object v2, p0, Lt28;->q0:Lql;

    .line 8
    .line 9
    iget-object v3, p0, Lt28;->r0:Lo88;

    .line 10
    .line 11
    iget-object v4, p0, Lt28;->s0:Lfi2;

    .line 12
    .line 13
    iget v5, p0, Lt28;->u0:I

    .line 14
    .line 15
    iget-boolean v6, p0, Lt28;->v0:Z

    .line 16
    .line 17
    iget v7, p0, Lt28;->w0:I

    .line 18
    .line 19
    iget v8, p0, Lt28;->x0:I

    .line 20
    .line 21
    iget-object v9, p0, Lt28;->y0:Ljava/util/List;

    .line 22
    .line 23
    iget-object v10, p0, Lt28;->B0:Lmx;

    .line 24
    .line 25
    invoke-direct/range {v1 .. v10}, Lez4;-><init>(Lql;Lo88;Lfi2;IZIILjava/util/List;Lmx;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lt28;->E0:Lez4;

    .line 29
    .line 30
    move-object v0, v1

    .line 31
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final Z0(Lfi1;)Lez4;
    .locals 2

    .line 1
    iget-object v0, p0, Lt28;->G0:Ls28;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Ls28;->c:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Ls28;->d:Lez4;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lez4;->d(Lfi1;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lt28;->Y0()Lez4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, p1}, Lez4;->d(Lfi1;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final h(Lf17;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lt28;->F0:Lr28;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr28;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lr28;-><init>(Lt28;B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lt28;->F0:Lr28;

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lt28;->q0:Lql;

    .line 14
    .line 15
    sget-object v2, Ld17;->a:[Lnw3;

    .line 16
    .line 17
    sget-object v2, Lc17;->C:Le17;

    .line 18
    .line 19
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v2, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lt28;->G0:Ls28;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v2, v1, Ls28;->b:Lql;

    .line 31
    .line 32
    sget-object v3, Lc17;->D:Le17;

    .line 33
    .line 34
    sget-object v4, Ld17;->a:[Lnw3;

    .line 35
    .line 36
    const/16 v5, 0x10

    .line 37
    .line 38
    aget-object v5, v4, v5

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v3, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v1, v1, Ls28;->c:Z

    .line 47
    .line 48
    sget-object v2, Lc17;->E:Le17;

    .line 49
    .line 50
    const/16 v3, 0x11

    .line 51
    .line 52
    aget-object v3, v4, v3

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v2, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    new-instance v1, Lr28;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-direct {v1, p0, v2}, Lr28;-><init>(Lt28;B)V

    .line 68
    .line 69
    .line 70
    sget-object v2, Ls07;->l:Le17;

    .line 71
    .line 72
    new-instance v3, Lq3;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct {v3, v4, v1}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v2, v3}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Lr28;

    .line 82
    .line 83
    const/4 v2, 0x2

    .line 84
    invoke-direct {v1, p0, v2}, Lr28;-><init>(Lt28;B)V

    .line 85
    .line 86
    .line 87
    sget-object v2, Ls07;->m:Le17;

    .line 88
    .line 89
    new-instance v3, Lq3;

    .line 90
    .line 91
    invoke-direct {v3, v4, v1}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, v2, v3}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lhr5;

    .line 98
    .line 99
    const/16 v2, 0x1c

    .line 100
    .line 101
    invoke-direct {v1, p0, v2}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Ls07;->n:Le17;

    .line 105
    .line 106
    new-instance v2, Lq3;

    .line 107
    .line 108
    invoke-direct {v2, v4, v1}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, p0, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0}, Ld17;->a(Lf17;Lgn2;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final i0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt28;->Z0(Lfi1;)Lez4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lez4;->e(Lz24;)Ly5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ly5;->l()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Lz38;->a(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final m0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt28;->Z0(Lfi1;)Lez4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lez4;->e(Lz24;)Ly5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ly5;->h()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Lz38;->a(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final u0(Lp34;)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_8

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, Lp34;->X:Lum0;

    .line 8
    .line 9
    iget-object v0, v0, Lum0;->Y:Llr;

    .line 10
    .line 11
    invoke-virtual {v0}, Llr;->k()Lsm0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0, p1}, Lt28;->Z0(Lfi1;)Lez4;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, Lez4;->o:Lx78;

    .line 20
    .line 21
    if-eqz v1, :cond_11

    .line 22
    .line 23
    iget-wide v3, v1, Lx78;->c:J

    .line 24
    .line 25
    move-object v0, v1

    .line 26
    iget-object v1, v0, Lx78;->b:Lbz4;

    .line 27
    .line 28
    const/16 v5, 0x20

    .line 29
    .line 30
    shr-long v6, v3, v5

    .line 31
    .line 32
    long-to-int v6, v6

    .line 33
    int-to-float v6, v6

    .line 34
    iget v7, v1, Lbz4;->d:F

    .line 35
    .line 36
    cmpg-float v6, v6, v7

    .line 37
    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v9, 0x0

    .line 40
    if-gez v6, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0}, Lx78;->d()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    :goto_0
    iget v0, p0, Lt28;->u0:I

    .line 50
    .line 51
    const/4 v6, 0x3

    .line 52
    if-ne v0, v6, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v10, v8

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    :goto_1
    move v10, v9

    .line 58
    :goto_2
    if-eqz v10, :cond_4

    .line 59
    .line 60
    shr-long v6, v3, v5

    .line 61
    .line 62
    long-to-int v0, v6

    .line 63
    int-to-float v0, v0

    .line 64
    const-wide v6, 0xffffffffL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v3, v6

    .line 70
    long-to-int v3, v3

    .line 71
    int-to-float v3, v3

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-long v11, v0

    .line 77
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-long v3, v0

    .line 82
    shl-long/2addr v11, v5

    .line 83
    and-long/2addr v3, v6

    .line 84
    or-long/2addr v3, v11

    .line 85
    const-wide/16 v5, 0x0

    .line 86
    .line 87
    invoke-static {v5, v6, v3, v4}, Lu70;->n(JJ)Ls86;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v2}, Lsm0;->g()V

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v0}, Lsm0;->q(Lsm0;Ls86;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    :try_start_0
    iget-object v0, p0, Lt28;->r0:Lo88;

    .line 98
    .line 99
    iget-object v0, v0, Lo88;->a:Lqe7;

    .line 100
    .line 101
    iget-object v3, v0, Lqe7;->m:Lx38;

    .line 102
    .line 103
    if-nez v3, :cond_5

    .line 104
    .line 105
    sget-object v3, Lx38;->b:Lx38;

    .line 106
    .line 107
    :cond_5
    move-object v6, v3

    .line 108
    goto :goto_3

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    move-object p0, v0

    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :goto_3
    iget-object v3, v0, Lqe7;->n:Lt67;

    .line 114
    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    sget-object v3, Lt67;->d:Lt67;

    .line 118
    .line 119
    :cond_6
    move-object v5, v3

    .line 120
    iget-object v3, v0, Lqe7;->p:Ltv1;

    .line 121
    .line 122
    if-nez v3, :cond_7

    .line 123
    .line 124
    sget-object v3, Lea2;->a:Lea2;

    .line 125
    .line 126
    :cond_7
    move-object v7, v3

    .line 127
    iget-object v0, v0, Lqe7;->a:Lf78;

    .line 128
    .line 129
    invoke-interface {v0}, Lf78;->c()Ld90;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_8

    .line 134
    .line 135
    iget-object v0, p0, Lt28;->r0:Lo88;

    .line 136
    .line 137
    iget-object v0, v0, Lo88;->a:Lqe7;

    .line 138
    .line 139
    iget-object v0, v0, Lqe7;->a:Lf78;

    .line 140
    .line 141
    invoke-interface {v0}, Lf78;->a()F

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-static/range {v1 .. v7}, Lbz4;->i(Lbz4;Lsm0;Ld90;FLt67;Lx38;Ltv1;)V

    .line 146
    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_8
    iget-object v0, p0, Lt28;->A0:Lfw0;

    .line 150
    .line 151
    if-eqz v0, :cond_9

    .line 152
    .line 153
    invoke-interface {v0}, Lfw0;->a()J

    .line 154
    .line 155
    .line 156
    move-result-wide v3

    .line 157
    goto :goto_4

    .line 158
    :cond_9
    sget-wide v3, Ldw0;->g:J

    .line 159
    .line 160
    :goto_4
    const-wide/16 v11, 0x10

    .line 161
    .line 162
    cmp-long v0, v3, v11

    .line 163
    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_a
    iget-object v0, p0, Lt28;->r0:Lo88;

    .line 168
    .line 169
    invoke-virtual {v0}, Lo88;->b()J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    cmp-long v0, v3, v11

    .line 174
    .line 175
    if-eqz v0, :cond_b

    .line 176
    .line 177
    iget-object v0, p0, Lt28;->r0:Lo88;

    .line 178
    .line 179
    invoke-virtual {v0}, Lo88;->b()J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    goto :goto_5

    .line 184
    :cond_b
    sget-wide v3, Ldw0;->b:J

    .line 185
    .line 186
    :goto_5
    invoke-static/range {v1 .. v7}, Lbz4;->h(Lbz4;Lsm0;JLt67;Lx38;Ltv1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .line 188
    .line 189
    :goto_6
    if-eqz v10, :cond_c

    .line 190
    .line 191
    invoke-interface {v2}, Lsm0;->p()V

    .line 192
    .line 193
    .line 194
    :cond_c
    iget-object v0, p0, Lt28;->G0:Ls28;

    .line 195
    .line 196
    if-eqz v0, :cond_d

    .line 197
    .line 198
    iget-boolean v0, v0, Ls28;->c:Z

    .line 199
    .line 200
    if-ne v0, v8, :cond_d

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_d
    iget-object v0, p0, Lt28;->q0:Lql;

    .line 204
    .line 205
    invoke-static {v0}, Lu28;->i(Lql;)Z

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    :goto_7
    if-nez v9, :cond_f

    .line 210
    .line 211
    iget-object p0, p0, Lt28;->y0:Ljava/util/List;

    .line 212
    .line 213
    if-eqz p0, :cond_e

    .line 214
    .line 215
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_f

    .line 220
    .line 221
    :cond_e
    :goto_8
    return-void

    .line 222
    :cond_f
    invoke-virtual {p1}, Lp34;->a()V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :goto_9
    if-eqz v10, :cond_10

    .line 227
    .line 228
    invoke-interface {v2}, Lsm0;->p()V

    .line 229
    .line 230
    .line 231
    :cond_10
    throw p0

    .line 232
    :cond_11
    const-string p0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "

    .line 233
    .line 234
    invoke-static {v0, p0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-void
.end method

.method public final y0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt28;->Z0(Lfi1;)Lez4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p3, p1}, Lez4;->a(ILz24;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
