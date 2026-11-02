.class public final Lq04;
.super Le14;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvv3;


# instance fields
.field public final f0:Lr04;


# direct methods
.method public constructor <init>(Lr04;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le14;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq04;->f0:Lr04;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lq04;->f0:Lr04;

    .line 2
    .line 3
    iget-object p0, p0, Lr04;->o0:Lg44;

    .line 4
    .line 5
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lq04;

    .line 10
    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Llb6;->S([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Ldn8;->a:Ldn8;

    .line 19
    .line 20
    return-object p0
.end method

.method public final U()Ll14;
    .locals 0

    .line 1
    iget-object p0, p0, Lq04;->f0:Lr04;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Lnw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lq04;->f0:Lr04;

    .line 2
    .line 3
    return-object p0
.end method
