.class public final Lwe0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final X:Lm51;

.field public final Y:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Lz47;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lz47;->Z:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ls98;

    .line 7
    .line 8
    iget-object v0, v0, Ls98;->f:Lu61;

    .line 9
    .line 10
    iget-object v1, p1, Lz47;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lbm3;

    .line 13
    .line 14
    new-instance v2, Low7;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Ldm3;-><init>(Lbm3;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v2}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lwe0;->X:Lm51;

    .line 28
    .line 29
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lwe0;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    new-instance v2, Lr0;

    .line 37
    .line 38
    const/4 v7, 0x7

    .line 39
    const/4 v6, 0x0

    .line 40
    move-object v5, p0

    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-direct/range {v2 .. v7}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x3

    .line 47
    invoke-static {v0, v6, v6, v2, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lwe0;->X:Lm51;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p0, v0}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final g(JLs51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lue0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lue0;

    .line 7
    .line 8
    iget v1, v0, Lue0;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lue0;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lue0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lue0;-><init>(Lwe0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lue0;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lue0;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iget-object p0, p0, Lwe0;->Y:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v4, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lue0;->f0:Lux0;

    .line 39
    .line 40
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p3, Lux0;

    .line 54
    .line 55
    invoke-direct {p3}, Lux0;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    new-instance v1, Lve0;

    .line 62
    .line 63
    invoke-direct {v1, p3, v3, v2}, Lve0;-><init>(Lux0;Lq51;B)V

    .line 64
    .line 65
    .line 66
    iput-object p3, v0, Lue0;->f0:Lux0;

    .line 67
    .line 68
    iput v4, v0, Lue0;->i0:I

    .line 69
    .line 70
    invoke-static {p1, p2, v1, v0}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p2, Lc71;->X:Lc71;

    .line 75
    .line 76
    if-ne p1, p2, :cond_3

    .line 77
    .line 78
    return-object p2

    .line 79
    :cond_3
    move-object v5, p3

    .line 80
    move-object p3, p1

    .line 81
    move-object p1, v5

    .line 82
    :goto_1
    if-eqz p3, :cond_4

    .line 83
    .line 84
    move v2, v4

    .line 85
    :cond_4
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
