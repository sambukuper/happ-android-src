.class public final Lpk6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi1;


# instance fields
.field public A0:Lmb6;

.field public X:I

.field public Y:F

.field public Z:F

.field public f0:F

.field public g0:F

.field public h0:F

.field public i0:F

.field public j0:J

.field public k0:J

.field public l0:F

.field public m0:F

.field public n0:F

.field public o0:F

.field public p0:J

.field public q0:Lx67;

.field public r0:Z

.field public s0:I

.field public t0:J

.field public u0:Lu24;

.field public v0:Lfi1;

.field public w0:Lz24;

.field public x0:Lo60;

.field public y0:Lg60;

.field public z0:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lpk6;->Y:F

    .line 7
    .line 8
    iput v0, p0, Lpk6;->Z:F

    .line 9
    .line 10
    iput v0, p0, Lpk6;->f0:F

    .line 11
    .line 12
    sget-wide v0, Lbu2;->a:J

    .line 13
    .line 14
    iput-wide v0, p0, Lpk6;->j0:J

    .line 15
    .line 16
    iput-wide v0, p0, Lpk6;->k0:J

    .line 17
    .line 18
    const/high16 v0, 0x41000000    # 8.0f

    .line 19
    .line 20
    iput v0, p0, Lpk6;->o0:F

    .line 21
    .line 22
    sget-wide v0, Lgd8;->b:J

    .line 23
    .line 24
    iput-wide v0, p0, Lpk6;->p0:J

    .line 25
    .line 26
    sget-object v0, Lu70;->e:Lx03;

    .line 27
    .line 28
    iput-object v0, p0, Lpk6;->q0:Lx67;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Lpk6;->s0:I

    .line 32
    .line 33
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v0, p0, Lpk6;->t0:J

    .line 39
    .line 40
    sget-object v0, Lu24;->e:Lu24;

    .line 41
    .line 42
    iput-object v0, p0, Lpk6;->u0:Lu24;

    .line 43
    .line 44
    invoke-static {}, Li21;->b()Lii1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lpk6;->v0:Lfi1;

    .line 49
    .line 50
    sget-object v0, Lz24;->X:Lz24;

    .line 51
    .line 52
    iput-object v0, p0, Lpk6;->w0:Lz24;

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    iput v0, p0, Lpk6;->z0:I

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lpk6;->g(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lpk6;->h(F)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lpk6;->b(F)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lpk6;->n(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lpk6;->o(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lpk6;->j(F)V

    .line 20
    .line 21
    .line 22
    sget-wide v1, Lbu2;->a:J

    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Lpk6;->c(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v2}, Lpk6;->l(J)V

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lpk6;->l0:F

    .line 31
    .line 32
    cmpg-float v1, v1, v0

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget v1, p0, Lpk6;->X:I

    .line 38
    .line 39
    or-int/lit16 v1, v1, 0x100

    .line 40
    .line 41
    iput v1, p0, Lpk6;->X:I

    .line 42
    .line 43
    iput v0, p0, Lpk6;->l0:F

    .line 44
    .line 45
    :goto_0
    iget v1, p0, Lpk6;->m0:F

    .line 46
    .line 47
    cmpg-float v1, v1, v0

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget v1, p0, Lpk6;->X:I

    .line 53
    .line 54
    or-int/lit16 v1, v1, 0x200

    .line 55
    .line 56
    iput v1, p0, Lpk6;->X:I

    .line 57
    .line 58
    iput v0, p0, Lpk6;->m0:F

    .line 59
    .line 60
    :goto_1
    iget v1, p0, Lpk6;->n0:F

    .line 61
    .line 62
    cmpg-float v1, v1, v0

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget v1, p0, Lpk6;->X:I

    .line 68
    .line 69
    or-int/lit16 v1, v1, 0x400

    .line 70
    .line 71
    iput v1, p0, Lpk6;->X:I

    .line 72
    .line 73
    iput v0, p0, Lpk6;->n0:F

    .line 74
    .line 75
    :goto_2
    iget v0, p0, Lpk6;->o0:F

    .line 76
    .line 77
    const/high16 v1, 0x41000000    # 8.0f

    .line 78
    .line 79
    cmpg-float v0, v0, v1

    .line 80
    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    iget v0, p0, Lpk6;->X:I

    .line 85
    .line 86
    or-int/lit16 v0, v0, 0x800

    .line 87
    .line 88
    iput v0, p0, Lpk6;->X:I

    .line 89
    .line 90
    iput v1, p0, Lpk6;->o0:F

    .line 91
    .line 92
    :goto_3
    sget-wide v0, Lgd8;->b:J

    .line 93
    .line 94
    invoke-virtual {p0, v0, v1}, Lpk6;->m(J)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lu70;->e:Lx03;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lpk6;->k(Lx67;)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-virtual {p0, v0}, Lpk6;->d(Z)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lpk6;->x0:Lo60;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_4

    .line 114
    .line 115
    iget v1, p0, Lpk6;->X:I

    .line 116
    .line 117
    const/high16 v3, 0x20000

    .line 118
    .line 119
    or-int/2addr v1, v3

    .line 120
    iput v1, p0, Lpk6;->X:I

    .line 121
    .line 122
    iput-object v2, p0, Lpk6;->x0:Lo60;

    .line 123
    .line 124
    :cond_4
    iget-object v1, p0, Lpk6;->y0:Lg60;

    .line 125
    .line 126
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_5

    .line 131
    .line 132
    iget v1, p0, Lpk6;->X:I

    .line 133
    .line 134
    const/high16 v3, 0x40000

    .line 135
    .line 136
    or-int/2addr v1, v3

    .line 137
    iput v1, p0, Lpk6;->X:I

    .line 138
    .line 139
    iput-object v2, p0, Lpk6;->y0:Lg60;

    .line 140
    .line 141
    :cond_5
    iget v1, p0, Lpk6;->z0:I

    .line 142
    .line 143
    const/4 v3, 0x3

    .line 144
    if-ne v1, v3, :cond_6

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    iget v1, p0, Lpk6;->X:I

    .line 148
    .line 149
    const/high16 v4, 0x80000

    .line 150
    .line 151
    or-int/2addr v1, v4

    .line 152
    iput v1, p0, Lpk6;->X:I

    .line 153
    .line 154
    iput v3, p0, Lpk6;->z0:I

    .line 155
    .line 156
    :goto_4
    iget v1, p0, Lpk6;->s0:I

    .line 157
    .line 158
    if-nez v1, :cond_7

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    iget v1, p0, Lpk6;->X:I

    .line 162
    .line 163
    const v3, 0x8000

    .line 164
    .line 165
    .line 166
    or-int/2addr v1, v3

    .line 167
    iput v1, p0, Lpk6;->X:I

    .line 168
    .line 169
    iput v0, p0, Lpk6;->s0:I

    .line 170
    .line 171
    :goto_5
    sget-object v1, Lu24;->e:Lu24;

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Lpk6;->f(Lu24;)V

    .line 174
    .line 175
    .line 176
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    iput-wide v3, p0, Lpk6;->t0:J

    .line 182
    .line 183
    iput-object v2, p0, Lpk6;->A0:Lmb6;

    .line 184
    .line 185
    iput v0, p0, Lpk6;->X:I

    .line 186
    .line 187
    return-void
.end method

.method public final b(F)V
    .locals 1

    .line 1
    iget v0, p0, Lpk6;->f0:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lpk6;->X:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    iput v0, p0, Lpk6;->X:I

    .line 13
    .line 14
    iput p1, p0, Lpk6;->f0:F

    .line 15
    .line 16
    return-void
.end method

.method public final b0()F
    .locals 0

    .line 1
    iget-object p0, p0, Lpk6;->v0:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0}, Lfi1;->b0()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lpk6;->j0:J

    .line 2
    .line 3
    sget v2, Ldw0;->h:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Ltk8;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lpk6;->X:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x40

    .line 14
    .line 15
    iput v0, p0, Lpk6;->X:I

    .line 16
    .line 17
    iput-wide p1, p0, Lpk6;->j0:J

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lpk6;->r0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpk6;->X:I

    .line 6
    .line 7
    or-int/lit16 v0, v0, 0x4000

    .line 8
    .line 9
    iput v0, p0, Lpk6;->X:I

    .line 10
    .line 11
    iput-boolean p1, p0, Lpk6;->r0:Z

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final f(Lu24;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpk6;->u0:Lu24;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lpk6;->X:I

    .line 10
    .line 11
    const/high16 v1, 0x100000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    iput v0, p0, Lpk6;->X:I

    .line 15
    .line 16
    iput-object p1, p0, Lpk6;->u0:Lu24;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final g(F)V
    .locals 1

    .line 1
    iget v0, p0, Lpk6;->Y:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lpk6;->X:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lpk6;->X:I

    .line 13
    .line 14
    iput p1, p0, Lpk6;->Y:F

    .line 15
    .line 16
    return-void
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, Lpk6;->v0:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0}, Lfi1;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h(F)V
    .locals 1

    .line 1
    iget v0, p0, Lpk6;->Z:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lpk6;->X:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    iput v0, p0, Lpk6;->X:I

    .line 13
    .line 14
    iput p1, p0, Lpk6;->Z:F

    .line 15
    .line 16
    return-void
.end method

.method public final j(F)V
    .locals 1

    .line 1
    iget v0, p0, Lpk6;->i0:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lpk6;->X:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Lpk6;->X:I

    .line 13
    .line 14
    iput p1, p0, Lpk6;->i0:F

    .line 15
    .line 16
    return-void
.end method

.method public final k(Lx67;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpk6;->q0:Lx67;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lpk6;->X:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x2000

    .line 12
    .line 13
    iput v0, p0, Lpk6;->X:I

    .line 14
    .line 15
    iput-object p1, p0, Lpk6;->q0:Lx67;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final l(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lpk6;->k0:J

    .line 2
    .line 3
    sget v2, Ldw0;->h:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Ltk8;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lpk6;->X:I

    .line 12
    .line 13
    or-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    iput v0, p0, Lpk6;->X:I

    .line 16
    .line 17
    iput-wide p1, p0, Lpk6;->k0:J

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final m(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lpk6;->p0:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lgd8;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lpk6;->X:I

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x1000

    .line 12
    .line 13
    iput v0, p0, Lpk6;->X:I

    .line 14
    .line 15
    iput-wide p1, p0, Lpk6;->p0:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final n(F)V
    .locals 1

    .line 1
    iget v0, p0, Lpk6;->g0:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lpk6;->X:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    iput v0, p0, Lpk6;->X:I

    .line 13
    .line 14
    iput p1, p0, Lpk6;->g0:F

    .line 15
    .line 16
    return-void
.end method

.method public final o(F)V
    .locals 1

    .line 1
    iget v0, p0, Lpk6;->h0:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lpk6;->X:I

    .line 9
    .line 10
    or-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    iput v0, p0, Lpk6;->X:I

    .line 13
    .line 14
    iput p1, p0, Lpk6;->h0:F

    .line 15
    .line 16
    return-void
.end method
