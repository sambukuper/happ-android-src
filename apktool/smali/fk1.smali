.class public Lfk1;
.super Lgk1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmw3;


# instance fields
.field public final r0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Lfx5;Lyu3;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-direct {p0, p1, p2, p3}, Lgk1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 37
    new-instance p1, Ldk1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Ldk1;-><init>(Lfk1;B)V

    sget-object p2, Lw74;->X:Lw74;

    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    move-result-object p1

    iput-object p1, p0, Lfk1;->r0:Lg44;

    .line 38
    new-instance p1, Ldk1;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, Ldk1;-><init>(Lfk1;B)V

    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    return-void
.end method

.method public constructor <init>(Lov3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, Lgk1;-><init>(Lov3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ldk1;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Ldk1;-><init>(Lfk1;B)V

    .line 16
    .line 17
    .line 18
    sget-object p2, Lw74;->X:Lw74;

    .line 19
    .line 20
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lfk1;->r0:Lg44;

    .line 25
    .line 26
    new-instance p1, Ldk1;

    .line 27
    .line 28
    const/4 p3, 0x1

    .line 29
    invoke-direct {p1, p0, p3}, Ldk1;-><init>(Lfk1;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public bridge synthetic A(Lov3;Lyu3;)Lkb6;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfk1;->Z(Lov3;Lyu3;)Lfk1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lfk1;->r0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lek1;

    .line 8
    .line 9
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Llb6;->S([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final Y()Luj1;
    .locals 0

    .line 1
    iget-object p0, p0, Lfk1;->r0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lek1;

    .line 8
    .line 9
    return-object p0
.end method

.method public Z(Lov3;Lyu3;)Lfk1;
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
    new-instance v0, Lfk1;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgk1;->X()Lfx5;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p1, p0, p2}, Lfk1;-><init>(Lov3;Lfx5;Lyu3;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final b()Lek1;
    .locals 0

    .line 1
    iget-object p0, p0, Lfk1;->r0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lek1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()Lhw3;
    .locals 0

    .line 10
    iget-object p0, p0, Lfk1;->r0:Lg44;

    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lek1;

    return-object p0
.end method
