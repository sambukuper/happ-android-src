.class public final Ley2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:F

.field public final synthetic i0:F

.field public final synthetic j0:Loi;

.field public final synthetic k0:Lky2;


# direct methods
.method public constructor <init>(FFLoi;Lky2;Lq51;)V
    .locals 0

    .line 1
    iput p1, p0, Ley2;->h0:F

    .line 2
    .line 3
    iput p2, p0, Ley2;->i0:F

    .line 4
    .line 5
    iput-object p3, p0, Ley2;->j0:Loi;

    .line 6
    .line 7
    iput-object p4, p0, Ley2;->k0:Lky2;

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
    invoke-virtual {p0, p2, p1}, Ley2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ley2;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ley2;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Ley2;

    .line 2
    .line 3
    iget-object v3, p0, Ley2;->j0:Loi;

    .line 4
    .line 5
    iget-object v4, p0, Ley2;->k0:Lky2;

    .line 6
    .line 7
    iget v1, p0, Ley2;->h0:F

    .line 8
    .line 9
    iget v2, p0, Ley2;->i0:F

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Ley2;-><init>(FFLoi;Lky2;Lq51;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Ley2;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    move-object v7, p0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Ley2;->h0:F

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    cmpl-float p1, p1, v0

    .line 27
    .line 28
    iget v0, p0, Ley2;->i0:F

    .line 29
    .line 30
    if-lez p1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    neg-float v0, v0

    .line 34
    :goto_0
    new-instance v4, Ljava/lang/Float;

    .line 35
    .line 36
    invoke-direct {v4, v0}, Ljava/lang/Float;-><init>(F)V

    .line 37
    .line 38
    .line 39
    const/16 p1, 0xc8

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    invoke-static {p1, v0, v2}, Lwl7;->i0(IILxx1;)Lsg8;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iput-boolean v1, p0, Ley2;->g0:Z

    .line 47
    .line 48
    iget-object v3, p0, Ley2;->j0:Loi;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/16 v8, 0xc

    .line 52
    .line 53
    move-object v7, p0

    .line 54
    invoke-static/range {v3 .. v8}, Loi;->a(Loi;Ljava/lang/Object;Lpk;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object p1, Lc71;->X:Lc71;

    .line 59
    .line 60
    if-ne p0, p1, :cond_3

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    :goto_1
    iget-object p0, v7, Ley2;->k0:Lky2;

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Lky2;->a(Lby2;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Ldn8;->a:Ldn8;

    .line 69
    .line 70
    return-object p0
.end method
