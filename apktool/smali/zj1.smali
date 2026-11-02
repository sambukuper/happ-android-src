.class public Lzj1;
.super Lgk1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljw3;


# instance fields
.field public final r0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Lfx5;Lyu3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3}, Lgk1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lxj1;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p0, p2}, Lxj1;-><init>(Lzj1;B)V

    .line 14
    .line 15
    .line 16
    sget-object p2, Lw74;->X:Lw74;

    .line 17
    .line 18
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lzj1;->r0:Lg44;

    .line 23
    .line 24
    new-instance p1, Lxj1;

    .line 25
    .line 26
    const/4 p3, 0x1

    .line 27
    invoke-direct {p1, p0, p3}, Lxj1;-><init>(Lzj1;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Lov3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lgk1;-><init>(Lov3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    new-instance p1, Lxj1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lxj1;-><init>(Lzj1;B)V

    sget-object p2, Lw74;->X:Lw74;

    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    move-result-object p1

    iput-object p1, p0, Lzj1;->r0:Lg44;

    .line 36
    new-instance p1, Lxj1;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, Lxj1;-><init>(Lzj1;B)V

    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    return-void
.end method


# virtual methods
.method public bridge synthetic A(Lov3;Lyu3;)Lkb6;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzj1;->Z(Lov3;Lyu3;)Lzj1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final Y()Luj1;
    .locals 0

    .line 1
    iget-object p0, p0, Lzj1;->r0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyj1;

    .line 8
    .line 9
    return-object p0
.end method

.method public Z(Lov3;Lyu3;)Lzj1;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lzj1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgk1;->X()Lfx5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p1, p0, p2}, Lzj1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final b()Lhw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lzj1;->r0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyj1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()Liw3;
    .locals 0

    .line 10
    iget-object p0, p0, Lzj1;->r0:Lg44;

    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyj1;

    return-object p0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lzj1;->r0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyj1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Llb6;->S([Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzj1;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
