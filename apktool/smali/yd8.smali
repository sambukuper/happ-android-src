.class public final Lyd8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llh7;


# instance fields
.field public final X:Lug8;

.field public final Y:Lrh5;

.field public final Z:Lrh5;

.field public final f0:Lrh5;

.field public final g0:Lrh5;

.field public final h0:Lnh5;

.field public i0:Z

.field public final j0:Lrh5;

.field public k0:Lwk;

.field public final l0:Lph5;

.field public m0:Z

.field public final n0:Lwf7;

.field public final synthetic o0:Lce8;


# direct methods
.method public constructor <init>(Lce8;Ljava/lang/Object;Lwk;Lug8;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyd8;->o0:Lce8;

    .line 5
    .line 6
    iput-object p4, p0, Lyd8;->X:Lug8;

    .line 7
    .line 8
    invoke-static {p2}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lyd8;->Y:Lrh5;

    .line 13
    .line 14
    const/4 v0, 0x7

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v1, v1, v2, v0}, Lwl7;->V(FFLjava/lang/Object;I)Lwf7;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lyd8;->Z:Lrh5;

    .line 26
    .line 27
    new-instance v3, Lt18;

    .line 28
    .line 29
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v4, v0

    .line 34
    check-cast v4, Lta2;

    .line 35
    .line 36
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    move-object v6, p2

    .line 41
    move-object v8, p3

    .line 42
    move-object v5, p4

    .line 43
    invoke-direct/range {v3 .. v8}, Lt18;-><init>(Lpk;Lug8;Ljava/lang/Object;Ljava/lang/Object;Lwk;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lyd8;->f0:Lrh5;

    .line 51
    .line 52
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lyd8;->g0:Lrh5;

    .line 59
    .line 60
    new-instance p1, Lnh5;

    .line 61
    .line 62
    const/high16 p2, -0x40800000    # -1.0f

    .line 63
    .line 64
    invoke-direct {p1, p2}, Lnh5;-><init>(F)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lyd8;->h0:Lnh5;

    .line 68
    .line 69
    invoke-static {v6}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lyd8;->j0:Lrh5;

    .line 74
    .line 75
    iput-object v8, p0, Lyd8;->k0:Lwk;

    .line 76
    .line 77
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lt18;->b()J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    new-instance p3, Lph5;

    .line 86
    .line 87
    invoke-direct {p3, p1, p2}, Lph5;-><init>(J)V

    .line 88
    .line 89
    .line 90
    iput-object p3, p0, Lyd8;->l0:Lph5;

    .line 91
    .line 92
    sget-object p1, Liz8;->a:Ljava/util/Map;

    .line 93
    .line 94
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/lang/Float;

    .line 99
    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iget-object p2, v5, Lug8;->a:Lgn2;

    .line 107
    .line 108
    invoke-interface {p2, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Lwk;

    .line 113
    .line 114
    invoke-virtual {p2}, Lwk;->b()I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    const/4 p4, 0x0

    .line 119
    :goto_0
    if-ge p4, p3, :cond_0

    .line 120
    .line 121
    invoke-virtual {p2, p4, p1}, Lwk;->e(IF)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 p4, p4, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_0
    iget-object p1, p0, Lyd8;->X:Lug8;

    .line 128
    .line 129
    iget-object p1, p1, Lug8;->b:Lgn2;

    .line 130
    .line 131
    invoke-interface {p1, p2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    :cond_1
    const/4 p1, 0x3

    .line 136
    invoke-static {v1, v1, v2, p1}, Lwl7;->V(FFLjava/lang/Object;I)Lwf7;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lyd8;->n0:Lwf7;

    .line 141
    .line 142
    return-void
.end method


# virtual methods
.method public final a()Lt18;
    .locals 0

    .line 1
    iget-object p0, p0, Lyd8;->f0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lt18;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyd8;->h0:Lnh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnh5;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lyd8;->m0:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lt18;->c:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v1, v1, Lt18;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, Lt18;->c:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lyd8;->c(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-wide/16 v1, 0x0

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lt18;->f(J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Lyd8;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, v1, v2}, Lt18;->d(J)Lwk;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lyd8;->k0:Lwk;

    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyd8;->j0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Ljava/lang/Object;Z)V
    .locals 13

    .line 1
    iget-object v0, p0, Lyd8;->Y:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v2, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lyd8;->l0:Lph5;

    .line 13
    .line 14
    iget-object v3, p0, Lyd8;->f0:Lrh5;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    iget-object v6, p0, Lyd8;->n0:Lwf7;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v5, Lt18;

    .line 22
    .line 23
    iget-object p2, p0, Lyd8;->k0:Lwk;

    .line 24
    .line 25
    invoke-virtual {p2}, Lwk;->c()Lwk;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    iget-object v7, p0, Lyd8;->X:Lug8;

    .line 30
    .line 31
    move-object v9, p1

    .line 32
    move-object v8, p1

    .line 33
    invoke-direct/range {v5 .. v10}, Lt18;-><init>(Lpk;Lug8;Ljava/lang/Object;Ljava/lang/Object;Lwk;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v5}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v4, p0, Lyd8;->i0:Z

    .line 40
    .line 41
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Lt18;->b()J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    invoke-virtual {v2, p0, p1}, Lph5;->m(J)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    move-object v8, p1

    .line 54
    iget-object p1, p0, Lyd8;->Z:Lrh5;

    .line 55
    .line 56
    if-eqz p2, :cond_1

    .line 57
    .line 58
    iget-boolean p2, p0, Lyd8;->m0:Z

    .line 59
    .line 60
    if-nez p2, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Lta2;

    .line 67
    .line 68
    instance-of p2, p2, Lwf7;

    .line 69
    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    move-object v6, p1

    .line 77
    check-cast v6, Lta2;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    move-object v6, p1

    .line 85
    check-cast v6, Lta2;

    .line 86
    .line 87
    :cond_2
    :goto_0
    iget-object p1, p0, Lyd8;->o0:Lce8;

    .line 88
    .line 89
    invoke-virtual {p1}, Lce8;->e()J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    const-wide/16 v11, 0x0

    .line 94
    .line 95
    cmp-long p2, v9, v11

    .line 96
    .line 97
    if-gtz p2, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {p1}, Lce8;->e()J

    .line 101
    .line 102
    .line 103
    move-result-wide v9

    .line 104
    new-instance p2, Lzg7;

    .line 105
    .line 106
    invoke-direct {p2, v6, v9, v10}, Lzg7;-><init>(Lta2;J)V

    .line 107
    .line 108
    .line 109
    move-object v6, p2

    .line 110
    :goto_1
    new-instance v7, Lt18;

    .line 111
    .line 112
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    iget-object v12, p0, Lyd8;->k0:Lwk;

    .line 117
    .line 118
    iget-object v9, p0, Lyd8;->X:Lug8;

    .line 119
    .line 120
    move-object v10, v8

    .line 121
    move-object v8, v6

    .line 122
    invoke-direct/range {v7 .. v12}, Lt18;-><init>(Lpk;Lug8;Ljava/lang/Object;Ljava/lang/Object;Lwk;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v7}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p2}, Lt18;->b()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    invoke-virtual {v2, v0, v1}, Lph5;->m(J)V

    .line 137
    .line 138
    .line 139
    const/4 p2, 0x0

    .line 140
    iput-boolean p2, p0, Lyd8;->i0:Z

    .line 141
    .line 142
    invoke-virtual {p1, v4}, Lce8;->k(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lce8;->g()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_5

    .line 150
    .line 151
    iget-object p0, p1, Lce8;->j:Lvd7;

    .line 152
    .line 153
    invoke-virtual {p0}, Lvd7;->size()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    move v1, p2

    .line 158
    :goto_2
    if-ge v1, v0, :cond_4

    .line 159
    .line 160
    invoke-virtual {p0, v1}, Lvd7;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Lyd8;

    .line 165
    .line 166
    iget-object v3, v2, Lyd8;->l0:Lph5;

    .line 167
    .line 168
    invoke-virtual {v3}, Lph5;->l()J

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Lyd8;->b()V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v1, v1, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    invoke-virtual {p1, p2}, Lce8;->k(Z)V

    .line 178
    .line 179
    .line 180
    :cond_5
    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;Lta2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyd8;->Y:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyd8;->Z:Lrh5;

    .line 7
    .line 8
    invoke-virtual {v0, p3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    iget-object p3, p3, Lt18;->d:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p3, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    iget-object p3, p3, Lt18;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p3, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p0, p1, p2}, Lyd8;->e(Ljava/lang/Object;Z)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final g(Ljava/lang/Object;Lta2;Ljava/lang/Object;Lwk;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyd8;->i0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lyd8;->Y:Lrh5;

    .line 14
    .line 15
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v2, -0x40800000    # -1.0f

    .line 24
    .line 25
    iget-object v3, p0, Lyd8;->h0:Lnh5;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v3}, Lnh5;->l()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    cmpg-float v1, v1, v2

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v1, v1, Lt18;->d:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void

    .line 52
    :cond_2
    invoke-virtual {v0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lyd8;->Z:Lrh5;

    .line 56
    .line 57
    invoke-virtual {v0, p2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/high16 p2, -0x3fc00000    # -3.0f

    .line 61
    .line 62
    if-nez p3, :cond_4

    .line 63
    .line 64
    invoke-virtual {v3}, Lnh5;->l()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    cmpg-float v0, v0, p2

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    move-object v0, p1

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iget-object v0, p0, Lyd8;->j0:Lrh5;

    .line 75
    .line 76
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move-object v0, p3

    .line 82
    :goto_1
    if-eqz p3, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lyd8;->c(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    if-eqz p4, :cond_5

    .line 88
    .line 89
    iput-object p4, p0, Lyd8;->k0:Lwk;

    .line 90
    .line 91
    :cond_5
    iget-object p3, p0, Lyd8;->g0:Lrh5;

    .line 92
    .line 93
    invoke-virtual {p3}, Lrh5;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    check-cast p4, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p4

    .line 103
    const/4 v1, 0x1

    .line 104
    xor-int/2addr p4, v1

    .line 105
    invoke-virtual {p0, v0, p4}, Lyd8;->e(Ljava/lang/Object;Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Lnh5;->l()F

    .line 109
    .line 110
    .line 111
    move-result p4

    .line 112
    cmpg-float p4, p4, p2

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    if-nez p4, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    move v1, v0

    .line 119
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    invoke-virtual {p3, p4}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Lnh5;->l()F

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    const/4 p4, 0x0

    .line 131
    cmpl-float p3, p3, p4

    .line 132
    .line 133
    if-ltz p3, :cond_7

    .line 134
    .line 135
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lt18;->b()J

    .line 140
    .line 141
    .line 142
    move-result-wide p1

    .line 143
    invoke-virtual {p0}, Lyd8;->a()Lt18;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    long-to-float p1, p1

    .line 148
    invoke-virtual {v3}, Lnh5;->l()F

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    mul-float/2addr p2, p1

    .line 153
    float-to-long p1, p2

    .line 154
    invoke-virtual {p3, p1, p2}, Lt18;->f(J)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p0, p1}, Lyd8;->c(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    invoke-virtual {v3}, Lnh5;->l()F

    .line 163
    .line 164
    .line 165
    move-result p3

    .line 166
    cmpg-float p2, p3, p2

    .line 167
    .line 168
    if-nez p2, :cond_8

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Lyd8;->c(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    :goto_3
    iput-boolean v0, p0, Lyd8;->i0:Z

    .line 174
    .line 175
    invoke-virtual {v3, v2}, Lnh5;->m(F)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyd8;->j0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lyd8;->j0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lyd8;->Y:Lrh5;

    .line 8
    .line 9
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object p0, p0, Lyd8;->Z:Lrh5;

    .line 14
    .line 15
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lta2;

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v3, "current value: "

    .line 24
    .line 25
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", target: "

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", spec: "

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
