.class public final Lxz6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Ltb3;

.field public final synthetic Y:Z

.field public final synthetic Z:Z

.field public final synthetic f0:Lkl6;

.field public final synthetic g0:Ldn2;


# direct methods
.method public constructor <init>(Ltb3;ZZLkl6;Ldn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxz6;->X:Ltb3;

    .line 5
    .line 6
    iput-boolean p2, p0, Lxz6;->Y:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lxz6;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lxz6;->f0:Lkl6;

    .line 11
    .line 12
    iput-object p5, p0, Lxz6;->g0:Ldn2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lkx4;

    .line 2
    .line 3
    check-cast p2, Llp2;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const p1, -0x5af0b3b9

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p1}, Llp2;->W(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p3, Lzz0;->a:Lbe;

    .line 21
    .line 22
    if-ne p1, p3, :cond_0

    .line 23
    .line 24
    new-instance p1, Lxz4;

    .line 25
    .line 26
    invoke-direct {p1}, Lxz4;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v2, p1

    .line 33
    check-cast v2, Lxz4;

    .line 34
    .line 35
    sget-object p1, Lhx4;->X:Lhx4;

    .line 36
    .line 37
    iget-object p3, p0, Lxz6;->X:Ltb3;

    .line 38
    .line 39
    invoke-static {p1, v2, p3}, Lqb3;->a(Lkx4;Lxz4;Ltb3;)Lkx4;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lwz6;

    .line 44
    .line 45
    iget-object v5, p0, Lxz6;->f0:Lkl6;

    .line 46
    .line 47
    iget-object v6, p0, Lxz6;->g0:Ldn2;

    .line 48
    .line 49
    iget-boolean v1, p0, Lxz6;->Y:Z

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    iget-boolean v4, p0, Lxz6;->Z:Z

    .line 53
    .line 54
    invoke-direct/range {v0 .. v6}, Lwz6;-><init>(ZLxz4;Ltb3;ZLkl6;Ldn2;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-virtual {p2, p1}, Llp2;->p(Z)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method
