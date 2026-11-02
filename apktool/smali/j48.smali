.class public final Lj48;
.super Lqx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lj48;",
        "Lqx4;",
        "Ln48;",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final X:Z

.field public final Y:Z

.field public final Z:Z

.field public final f0:Ly78;

.field public final g0:Lkd8;

.field public final h0:Lr68;

.field public final i0:Ld90;

.field public final j0:Z

.field public final k0:Lay6;

.field public final l0:Lsd5;

.field public final m0:Lub8;

.field public final n0:Lip5;


# direct methods
.method public constructor <init>(ZZZLy78;Lkd8;Lr68;Ld90;ZLay6;Lsd5;Lub8;Lip5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lj48;->X:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lj48;->Y:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lj48;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lj48;->f0:Ly78;

    .line 11
    .line 12
    iput-object p5, p0, Lj48;->g0:Lkd8;

    .line 13
    .line 14
    iput-object p6, p0, Lj48;->h0:Lr68;

    .line 15
    .line 16
    iput-object p7, p0, Lj48;->i0:Ld90;

    .line 17
    .line 18
    iput-boolean p8, p0, Lj48;->j0:Z

    .line 19
    .line 20
    iput-object p9, p0, Lj48;->k0:Lay6;

    .line 21
    .line 22
    iput-object p10, p0, Lj48;->l0:Lsd5;

    .line 23
    .line 24
    iput-object p11, p0, Lj48;->m0:Lub8;

    .line 25
    .line 26
    iput-object p12, p0, Lj48;->n0:Lip5;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()Ljx4;
    .locals 13

    .line 1
    new-instance v0, Ln48;

    .line 2
    .line 3
    iget-object v11, p0, Lj48;->m0:Lub8;

    .line 4
    .line 5
    iget-object v12, p0, Lj48;->n0:Lip5;

    .line 6
    .line 7
    iget-boolean v1, p0, Lj48;->X:Z

    .line 8
    .line 9
    iget-boolean v2, p0, Lj48;->Y:Z

    .line 10
    .line 11
    iget-boolean v3, p0, Lj48;->Z:Z

    .line 12
    .line 13
    iget-object v4, p0, Lj48;->f0:Ly78;

    .line 14
    .line 15
    iget-object v5, p0, Lj48;->g0:Lkd8;

    .line 16
    .line 17
    iget-object v6, p0, Lj48;->h0:Lr68;

    .line 18
    .line 19
    iget-object v7, p0, Lj48;->i0:Ld90;

    .line 20
    .line 21
    iget-boolean v8, p0, Lj48;->j0:Z

    .line 22
    .line 23
    iget-object v9, p0, Lj48;->k0:Lay6;

    .line 24
    .line 25
    iget-object v10, p0, Lj48;->l0:Lsd5;

    .line 26
    .line 27
    invoke-direct/range {v0 .. v12}, Ln48;-><init>(ZZZLy78;Lkd8;Lr68;Ld90;ZLay6;Lsd5;Lub8;Lip5;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final c(Ljx4;)V
    .locals 14

    .line 1
    check-cast p1, Ln48;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln48;->c1()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-boolean v1, p1, Ln48;->s0:Z

    .line 8
    .line 9
    iget-object v2, p1, Ln48;->v0:Lkd8;

    .line 10
    .line 11
    iget-object v3, p1, Ln48;->u0:Ly78;

    .line 12
    .line 13
    iget-object v4, p1, Ln48;->w0:Lr68;

    .line 14
    .line 15
    iget-object v5, p1, Ln48;->z0:Lay6;

    .line 16
    .line 17
    iget-boolean v6, p0, Lj48;->X:Z

    .line 18
    .line 19
    iput-boolean v6, p1, Ln48;->s0:Z

    .line 20
    .line 21
    iget-object v7, p0, Lj48;->h0:Lr68;

    .line 22
    .line 23
    iput-boolean v6, v7, Lr68;->h:Z

    .line 24
    .line 25
    iget-boolean v8, p0, Lj48;->Y:Z

    .line 26
    .line 27
    iput-boolean v8, p1, Ln48;->t0:Z

    .line 28
    .line 29
    iget-object v9, p0, Lj48;->f0:Ly78;

    .line 30
    .line 31
    iput-object v9, p1, Ln48;->u0:Ly78;

    .line 32
    .line 33
    iget-object v10, p0, Lj48;->g0:Lkd8;

    .line 34
    .line 35
    iput-object v10, p1, Ln48;->v0:Lkd8;

    .line 36
    .line 37
    iput-object v7, p1, Ln48;->w0:Lr68;

    .line 38
    .line 39
    iget-object v11, p0, Lj48;->i0:Ld90;

    .line 40
    .line 41
    iput-object v11, p1, Ln48;->x0:Ld90;

    .line 42
    .line 43
    iget-boolean v11, p0, Lj48;->j0:Z

    .line 44
    .line 45
    iput-boolean v11, p1, Ln48;->y0:Z

    .line 46
    .line 47
    iget-object v11, p0, Lj48;->k0:Lay6;

    .line 48
    .line 49
    iput-object v11, p1, Ln48;->z0:Lay6;

    .line 50
    .line 51
    iget-object v12, p0, Lj48;->l0:Lsd5;

    .line 52
    .line 53
    iput-object v12, p1, Ln48;->A0:Lsd5;

    .line 54
    .line 55
    iget-object v12, p0, Lj48;->m0:Lub8;

    .line 56
    .line 57
    iput-object v12, p1, Ln48;->B0:Lub8;

    .line 58
    .line 59
    iget-object v13, p0, Lj48;->n0:Lip5;

    .line 60
    .line 61
    iput-object v13, p1, Ln48;->C0:Lip5;

    .line 62
    .line 63
    iget-object v13, p1, Ln48;->J0:Ly58;

    .line 64
    .line 65
    if-nez v6, :cond_1

    .line 66
    .line 67
    if-nez v8, :cond_1

    .line 68
    .line 69
    iget-boolean p0, p0, Lj48;->Z:Z

    .line 70
    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 p0, 0x0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 77
    :goto_1
    invoke-virtual {v13, v10, v7, v9, p0}, Ly58;->b1(Lkd8;Lr68;Ly78;Z)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p1, Ln48;->K0:Lw38;

    .line 81
    .line 82
    iget-object v6, p0, Lw38;->s0:Lub8;

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    iput-object v8, v6, Lub8;->a:Lw38;

    .line 86
    .line 87
    iput-object v12, p0, Lw38;->s0:Lub8;

    .line 88
    .line 89
    iput-object p0, v12, Lub8;->a:Lw38;

    .line 90
    .line 91
    iget-boolean p0, p0, Ljx4;->p0:Z

    .line 92
    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    sget-object p0, Ltb8;->Z:Ltb8;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    sget-object p0, Ltb8;->Y:Ltb8;

    .line 99
    .line 100
    :goto_2
    iput-object p0, v12, Lub8;->b:Ltb8;

    .line 101
    .line 102
    invoke-virtual {p1}, Ln48;->c1()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    iget-object p0, p1, Ln48;->E0:Log7;

    .line 109
    .line 110
    if-eqz p0, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0, v8}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    iput-object v8, p1, Ln48;->E0:Log7;

    .line 116
    .line 117
    iget-object p0, p1, Ln48;->D0:Lo8;

    .line 118
    .line 119
    if-eqz p0, :cond_6

    .line 120
    .line 121
    iget-object p0, p0, Lo8;->Z:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 124
    .line 125
    invoke-virtual {p0, v8}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, Lbm3;

    .line 130
    .line 131
    if-eqz p0, :cond_6

    .line 132
    .line 133
    invoke-interface {p0, v8}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    if-eqz v1, :cond_5

    .line 138
    .line 139
    invoke-static {v2, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_5

    .line 144
    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    :cond_5
    invoke-virtual {p1}, Ln48;->d1()V

    .line 148
    .line 149
    .line 150
    :cond_6
    :goto_3
    invoke-static {v2, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_8

    .line 155
    .line 156
    invoke-static {v3, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_8

    .line 161
    .line 162
    invoke-static {v4, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_8

    .line 167
    .line 168
    invoke-static {v5, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_7

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_7
    return-void

    .line 176
    :cond_8
    :goto_4
    invoke-static {p1}, Lnr4;->E(Lg34;)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lj48;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lj48;

    .line 13
    .line 14
    iget-boolean v0, p0, Lj48;->X:Z

    .line 15
    .line 16
    iget-boolean v2, p1, Lj48;->X:Z

    .line 17
    .line 18
    if-eq v0, v2, :cond_2

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_2
    iget-boolean v0, p0, Lj48;->Y:Z

    .line 23
    .line 24
    iget-boolean v2, p1, Lj48;->Y:Z

    .line 25
    .line 26
    if-eq v0, v2, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-boolean v0, p0, Lj48;->Z:Z

    .line 30
    .line 31
    iget-boolean v2, p1, Lj48;->Z:Z

    .line 32
    .line 33
    if-eq v0, v2, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-object v0, p0, Lj48;->f0:Ly78;

    .line 37
    .line 38
    iget-object v2, p1, Lj48;->f0:Ly78;

    .line 39
    .line 40
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-object v0, p0, Lj48;->g0:Lkd8;

    .line 48
    .line 49
    iget-object v2, p1, Lj48;->g0:Lkd8;

    .line 50
    .line 51
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-object v0, p0, Lj48;->h0:Lr68;

    .line 59
    .line 60
    iget-object v2, p1, Lj48;->h0:Lr68;

    .line 61
    .line 62
    if-eq v0, v2, :cond_7

    .line 63
    .line 64
    return v1

    .line 65
    :cond_7
    iget-object v0, p0, Lj48;->i0:Ld90;

    .line 66
    .line 67
    iget-object v2, p1, Lj48;->i0:Ld90;

    .line 68
    .line 69
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-boolean v0, p0, Lj48;->j0:Z

    .line 77
    .line 78
    iget-boolean v2, p1, Lj48;->j0:Z

    .line 79
    .line 80
    if-eq v0, v2, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-object v0, p0, Lj48;->k0:Lay6;

    .line 84
    .line 85
    iget-object v2, p1, Lj48;->k0:Lay6;

    .line 86
    .line 87
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_a

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_a
    iget-object v0, p0, Lj48;->l0:Lsd5;

    .line 95
    .line 96
    iget-object v2, p1, Lj48;->l0:Lsd5;

    .line 97
    .line 98
    if-eq v0, v2, :cond_b

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_b
    iget-object v0, p0, Lj48;->m0:Lub8;

    .line 102
    .line 103
    iget-object v2, p1, Lj48;->m0:Lub8;

    .line 104
    .line 105
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_c

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_c
    iget-object p0, p0, Lj48;->n0:Lip5;

    .line 113
    .line 114
    iget-object p1, p1, Lj48;->n0:Lip5;

    .line 115
    .line 116
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_d

    .line 121
    .line 122
    :goto_0
    return v1

    .line 123
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 124
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lj48;->X:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lj48;->Y:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lj48;->Z:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lj48;->f0:Ly78;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lj48;->g0:Lkd8;

    .line 31
    .line 32
    invoke-virtual {v0}, Lkd8;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object v2, p0, Lj48;->h0:Lr68;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/2addr v2, v0

    .line 45
    mul-int/2addr v2, v1

    .line 46
    iget-object v0, p0, Lj48;->i0:Ld90;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, v2

    .line 53
    mul-int/2addr v0, v1

    .line 54
    iget-boolean v2, p0, Lj48;->j0:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Lpc6;->f(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, Lj48;->k0:Lay6;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-object v0, p0, Lj48;->l0:Lsd5;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    add-int/2addr v0, v2

    .line 75
    mul-int/2addr v0, v1

    .line 76
    iget-object v2, p0, Lj48;->m0:Lub8;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-object p0, p0, Lj48;->n0:Lip5;

    .line 85
    .line 86
    if-nez p0, :cond_0

    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    :goto_0
    add-int/2addr v2, p0

    .line 95
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextFieldCoreModifier(isFocused="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lj48;->X:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", isDragHovered="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lj48;->Y:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isTouchDragInProgress="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Lj48;->Z:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", textLayoutState="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lj48;->f0:Ly78;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", textFieldState="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lj48;->g0:Lkd8;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", textFieldSelectionState="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lj48;->h0:Lr68;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", cursorBrush="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lj48;->i0:Ld90;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", writeable="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, Lj48;->j0:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", scrollState="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lj48;->k0:Lay6;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", orientation="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lj48;->l0:Lsd5;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", toolbarRequester="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lj48;->m0:Lub8;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", platformSelectionBehaviors="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object p0, p0, Lj48;->n0:Lip5;

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p0, ")"

    .line 124
    .line 125
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method
