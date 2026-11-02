.class public final Ll48;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Ln48;


# direct methods
.method public constructor <init>(Ln48;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll48;->h0:Ln48;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq51;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll48;->m(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll48;

    .line 8
    .line 9
    sget-object p1, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ll48;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final m(Lq51;)Lq51;
    .locals 1

    .line 1
    new-instance v0, Ll48;

    .line 2
    .line 3
    iget-object p0, p0, Ll48;->h0:Ln48;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Ll48;-><init>(Ln48;Lq51;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Ll48;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Ll48;->h0:Ln48;

    .line 9
    .line 10
    sget-object v6, Lc71;->X:Lc71;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v4, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_5

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v5, Ln48;->w0:Lr68;

    .line 36
    .line 37
    iput-byte v4, p0, Ll48;->g0:B

    .line 38
    .line 39
    invoke-virtual {p1}, Lr68;->A()Ldn8;

    .line 40
    .line 41
    .line 42
    if-ne v2, v6, :cond_3

    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_3
    :goto_0
    iget-object p1, v5, Ln48;->C0:Lip5;

    .line 46
    .line 47
    if-eqz p1, :cond_7

    .line 48
    .line 49
    iget-object v0, v5, Ln48;->w0:Lr68;

    .line 50
    .line 51
    iget-object v0, v0, Lr68;->a:Lkd8;

    .line 52
    .line 53
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v12, v0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 58
    .line 59
    iget-object v0, v5, Ln48;->w0:Lr68;

    .line 60
    .line 61
    iget-object v0, v0, Lr68;->a:Lkd8;

    .line 62
    .line 63
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-wide v8, v0, Lh48;->f0:J

    .line 68
    .line 69
    iput-byte v3, p0, Ll48;->g0:B

    .line 70
    .line 71
    move-object v11, p1

    .line 72
    check-cast v11, Lop5;

    .line 73
    .line 74
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {v8, v9}, Lf88;->b(J)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    :goto_1
    move-object p0, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    new-instance v7, Llp5;

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    invoke-direct/range {v7 .. v12}, Llp5;-><init>(JLq51;Lop5;Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v11, Lop5;->a:Ls61;

    .line 96
    .line 97
    new-instance v0, Lmp5;

    .line 98
    .line 99
    invoke-direct {v0, v11, v7, v1}, Lmp5;-><init>(Lop5;Lrn2;Lq51;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1, v0, p0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_2
    if-ne p0, v6, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    move-object p0, v2

    .line 110
    :goto_3
    if-ne p0, v6, :cond_7

    .line 111
    .line 112
    :goto_4
    return-object v6

    .line 113
    :cond_7
    :goto_5
    iget-object p0, v5, Ln48;->w0:Lr68;

    .line 114
    .line 115
    iget-object p0, p0, Lr68;->t:Lrh5;

    .line 116
    .line 117
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-object v2
.end method
