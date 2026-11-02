.class public final synthetic Lvs7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lqs7;

.field public final synthetic Z:Lgn2;

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:Lj2;

.field public final synthetic h0:Z


# direct methods
.method public synthetic constructor <init>(ZLqs7;Lgn2;Lkx4;Lj2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lvs7;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lvs7;->Y:Lqs7;

    .line 7
    .line 8
    iput-object p3, p0, Lvs7;->Z:Lgn2;

    .line 9
    .line 10
    iput-object p4, p0, Lvs7;->f0:Lkx4;

    .line 11
    .line 12
    iput-object p5, p0, Lvs7;->g0:Lj2;

    .line 13
    .line 14
    iput-boolean p6, p0, Lvs7;->h0:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Luw0;

    .line 2
    .line 3
    check-cast p2, Llp2;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 p1, p3, 0x11

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    move p1, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    and-int/2addr p3, v1

    .line 25
    invoke-virtual {p2, p3, p1}, Llp2;->N(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    sget-object p1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 32
    .line 33
    new-instance v0, Lxs7;

    .line 34
    .line 35
    iget-boolean v1, p0, Lvs7;->X:Z

    .line 36
    .line 37
    iget-object v2, p0, Lvs7;->Y:Lqs7;

    .line 38
    .line 39
    iget-object v3, p0, Lvs7;->Z:Lgn2;

    .line 40
    .line 41
    iget-object v4, p0, Lvs7;->f0:Lkx4;

    .line 42
    .line 43
    iget-object v5, p0, Lvs7;->g0:Lj2;

    .line 44
    .line 45
    iget-boolean v6, p0, Lvs7;->h0:Z

    .line 46
    .line 47
    invoke-direct/range {v0 .. v6}, Lxs7;-><init>(ZLqs7;Lgn2;Lkx4;Lj2;Z)V

    .line 48
    .line 49
    .line 50
    const p0, 0x7df0ea5b

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, p2}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/16 p3, 0x186

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {p1, v0, p0, p2, p3}, Lw79;->a(Lkx4;Lrn2;Lzy0;Llp2;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p2}, Llp2;->Q()V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 68
    .line 69
    return-object p0
.end method
