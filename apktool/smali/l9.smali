.class public final Ll9;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public g0:Z

.field public synthetic h0:Lia;

.field public synthetic i0:Lke1;

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Lla;

.field public final synthetic l0:Lpk;


# direct methods
.method public constructor <init>(Lla;Lpk;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll9;->k0:Lla;

    .line 2
    .line 3
    iput-object p2, p0, Ll9;->l0:Lpk;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lia;

    .line 2
    .line 3
    check-cast p2, Lke1;

    .line 4
    .line 5
    check-cast p4, Lq51;

    .line 6
    .line 7
    new-instance v0, Ll9;

    .line 8
    .line 9
    iget-object v1, p0, Ll9;->k0:Lla;

    .line 10
    .line 11
    iget-object p0, p0, Ll9;->l0:Lpk;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0, p4}, Ll9;-><init>(Lla;Lpk;Lq51;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Ll9;->h0:Lia;

    .line 17
    .line 18
    iput-object p2, v0, Ll9;->i0:Lke1;

    .line 19
    .line 20
    iput-object p3, v0, Ll9;->j0:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ll9;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-boolean v0, p0, Ll9;->g0:Z

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-ne v0, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Ll9;->h0:Lia;

    .line 25
    .line 26
    iget-object v0, p0, Ll9;->i0:Lke1;

    .line 27
    .line 28
    iget-object v4, p0, Ll9;->j0:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v5, p0, Ll9;->k0:Lla;

    .line 31
    .line 32
    iget-object v6, v5, Lla;->g:Lnh5;

    .line 33
    .line 34
    invoke-virtual {v6}, Lnh5;->l()F

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    iput-object v2, p0, Ll9;->h0:Lia;

    .line 39
    .line 40
    iput-object v2, p0, Ll9;->i0:Lke1;

    .line 41
    .line 42
    iput-boolean v3, p0, Ll9;->g0:Z

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Lke1;->c(Ljava/lang/Object;)F

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    new-instance v0, Lba6;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v2, v5, Lla;->f:Lnh5;

    .line 54
    .line 55
    invoke-virtual {v2}, Lnh5;->l()F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v2, v5, Lla;->f:Lnh5;

    .line 68
    .line 69
    invoke-virtual {v2}, Lnh5;->l()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    :goto_0
    iput v2, v0, Lba6;->X:F

    .line 74
    .line 75
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    sget-object v3, Lc71;->X:Lc71;

    .line 80
    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    iget v7, v0, Lba6;->X:F

    .line 84
    .line 85
    cmpg-float v2, v7, v8

    .line 86
    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    new-instance v11, Li9;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v11, p1, v0, v2}, Li9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    iget-object v10, p0, Ll9;->l0:Lpk;

    .line 97
    .line 98
    move-object v12, p0

    .line 99
    invoke-static/range {v7 .. v12}, Lry7;->a(FFFLpk;Lrn2;Luy7;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v3, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    :goto_1
    move-object p0, v1

    .line 107
    :goto_2
    if-ne p0, v3, :cond_5

    .line 108
    .line 109
    return-object v3

    .line 110
    :cond_5
    :goto_3
    return-object v1
.end method
