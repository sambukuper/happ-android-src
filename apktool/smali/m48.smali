.class public final Lm48;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:F

.field public h0:B

.field public final synthetic i0:F

.field public final synthetic j0:Ln48;

.field public final synthetic k0:Z

.field public final synthetic l0:J

.field public final synthetic m0:Ls86;


# direct methods
.method public constructor <init>(FLn48;ZJLs86;Lq51;)V
    .locals 0

    .line 1
    iput p1, p0, Lm48;->i0:F

    .line 2
    .line 3
    iput-object p2, p0, Lm48;->j0:Ln48;

    .line 4
    .line 5
    iput-boolean p3, p0, Lm48;->k0:Z

    .line 6
    .line 7
    iput-wide p4, p0, Lm48;->l0:J

    .line 8
    .line 9
    iput-object p6, p0, Lm48;->m0:Ls86;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, Luy7;-><init>(ILq51;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lm48;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lm48;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lm48;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 8

    .line 1
    new-instance v0, Lm48;

    .line 2
    .line 3
    iget-wide v4, p0, Lm48;->l0:J

    .line 4
    .line 5
    iget-object v6, p0, Lm48;->m0:Ls86;

    .line 6
    .line 7
    iget v1, p0, Lm48;->i0:F

    .line 8
    .line 9
    iget-object v2, p0, Lm48;->j0:Ln48;

    .line 10
    .line 11
    iget-boolean v3, p0, Lm48;->k0:Z

    .line 12
    .line 13
    move-object v7, p1

    .line 14
    invoke-direct/range {v0 .. v7}, Lm48;-><init>(FLn48;ZJLs86;Lq51;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lm48;->h0:B

    .line 2
    .line 3
    iget-object v1, p0, Lm48;->j0:Ln48;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lc71;->X:Lc71;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v4, :cond_1

    .line 13
    .line 14
    if-ne v0, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    iget v0, p0, Lm48;->g0:F

    .line 29
    .line 30
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget p1, p0, Lm48;->i0:F

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    cmpl-float v0, p1, v2

    .line 53
    .line 54
    if-lez v0, :cond_5

    .line 55
    .line 56
    float-to-double v6, p1

    .line 57
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    :goto_0
    double-to-float p1, v6

    .line 62
    :cond_4
    :goto_1
    move v0, p1

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    float-to-double v6, p1

    .line 65
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    goto :goto_0

    .line 70
    :goto_2
    iget-object p1, v1, Ln48;->z0:Lay6;

    .line 71
    .line 72
    iput v0, p0, Lm48;->g0:F

    .line 73
    .line 74
    iput-byte v4, p0, Lm48;->h0:B

    .line 75
    .line 76
    invoke-static {p1, v0, p0}, Loc;->E(Lny6;FLs51;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v5, :cond_6

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iget-boolean v4, p0, Lm48;->k0:Z

    .line 90
    .line 91
    if-eqz v4, :cond_9

    .line 92
    .line 93
    iget-wide v6, p0, Lm48;->l0:J

    .line 94
    .line 95
    invoke-static {v6, v7}, Lf88;->b(J)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    iget-object v6, p0, Lm48;->m0:Ls86;

    .line 100
    .line 101
    if-eqz v4, :cond_8

    .line 102
    .line 103
    iget v4, v6, Ls86;->c:F

    .line 104
    .line 105
    iget v7, v6, Ls86;->a:F

    .line 106
    .line 107
    sub-float/2addr v4, v7

    .line 108
    cmpl-float v4, v4, v2

    .line 109
    .line 110
    if-gtz v4, :cond_8

    .line 111
    .line 112
    sub-float/2addr v0, p1

    .line 113
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    const/high16 v0, 0x3f800000    # 1.0f

    .line 118
    .line 119
    cmpg-float p1, p1, v0

    .line 120
    .line 121
    if-gez p1, :cond_7

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    iget p1, v6, Ls86;->c:F

    .line 125
    .line 126
    add-float/2addr p1, v0

    .line 127
    const/16 v0, 0xb

    .line 128
    .line 129
    invoke-static {v6, v2, p1, v0}, Ls86;->b(Ls86;FFI)Ls86;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    :cond_8
    :goto_4
    iget-object p1, v1, Ln48;->u0:Ly78;

    .line 134
    .line 135
    iget-object p1, p1, Ly78;->g:Lq80;

    .line 136
    .line 137
    iput-byte v3, p0, Lm48;->h0:B

    .line 138
    .line 139
    invoke-virtual {p1, v6, p0}, Lq80;->a(Ls86;Ls51;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-ne p0, v5, :cond_9

    .line 144
    .line 145
    :goto_5
    return-object v5

    .line 146
    :cond_9
    :goto_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 147
    .line 148
    return-object p0
.end method
