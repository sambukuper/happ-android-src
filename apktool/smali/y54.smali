.class public final Ly54;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Z

.field public final synthetic i0:Lz54;

.field public final synthetic j0:Lta2;

.field public final synthetic k0:Lxt2;


# direct methods
.method public constructor <init>(ZLz54;Lta2;Lxt2;Lq51;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ly54;->h0:Z

    .line 2
    .line 3
    iput-object p2, p0, Ly54;->i0:Lz54;

    .line 4
    .line 5
    iput-object p3, p0, Ly54;->j0:Lta2;

    .line 6
    .line 7
    iput-object p4, p0, Ly54;->k0:Lxt2;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p2, p1}, Ly54;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ly54;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ly54;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Ly54;

    .line 2
    .line 3
    iget-object v3, p0, Ly54;->j0:Lta2;

    .line 4
    .line 5
    iget-object v4, p0, Ly54;->k0:Lxt2;

    .line 6
    .line 7
    iget-boolean v1, p0, Ly54;->h0:Z

    .line 8
    .line 9
    iget-object v2, p0, Ly54;->i0:Lz54;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Ly54;-><init>(ZLz54;Lta2;Lxt2;Lq51;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Ly54;->i0:Lz54;

    .line 2
    .line 3
    iget-object v1, v0, Lz54;->i:Lrh5;

    .line 4
    .line 5
    iget-object v2, v0, Lz54;->q:Loi;

    .line 6
    .line 7
    iget-byte v3, p0, Ly54;->g0:B

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    sget-object v8, Lc71;->X:Lc71;

    .line 12
    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    if-eq v3, v5, :cond_1

    .line 16
    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p0, v0

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    :try_start_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :try_start_2
    iget-boolean p1, p0, Ly54;->h0:Z

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    new-instance p1, Ljava/lang/Float;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {p1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 48
    .line 49
    .line 50
    iput-byte v5, p0, Ly54;->g0:B

    .line 51
    .line 52
    invoke-virtual {v2, p0, p1}, Loi;->e(Lq51;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v8, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    new-instance v3, Ljava/lang/Float;

    .line 60
    .line 61
    const/high16 p1, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-direct {v3, p1}, Ljava/lang/Float;-><init>(F)V

    .line 64
    .line 65
    .line 66
    move p1, v4

    .line 67
    iget-object v4, p0, Ly54;->j0:Lta2;

    .line 68
    .line 69
    iget-object v5, p0, Ly54;->k0:Lxt2;

    .line 70
    .line 71
    move-object v6, v5

    .line 72
    new-instance v5, Lx54;

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    invoke-direct {v5, v6, v0, v7}, Lx54;-><init>(Lxt2;Lz54;B)V

    .line 76
    .line 77
    .line 78
    iput-byte p1, p0, Ly54;->g0:B

    .line 79
    .line 80
    const/4 v7, 0x4

    .line 81
    move-object v6, p0

    .line 82
    invoke-static/range {v2 .. v7}, Loi;->a(Loi;Ljava/lang/Object;Lpk;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v8, :cond_4

    .line 87
    .line 88
    :goto_1
    return-object v8

    .line 89
    :cond_4
    :goto_2
    check-cast p1, Lnk;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    .line 91
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v1, p0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Ldn8;->a:Ldn8;

    .line 97
    .line 98
    return-object p0

    .line 99
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    throw p0
.end method
