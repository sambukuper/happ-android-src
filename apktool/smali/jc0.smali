.class public final Ljc0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi1;


# instance fields
.field public X:Lea0;

.field public Y:Lvk1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lpz2;->K0:Lpz2;

    .line 5
    .line 6
    iput-object v0, p0, Ljc0;->X:Lea0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lgn2;)Lvk1;
    .locals 3

    .line 1
    new-instance v0, Lvk1;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lvk1;-><init>(BZ)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lvk1;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Ljc0;->Y:Lvk1;

    .line 11
    .line 12
    return-object v0
.end method

.method public final b0()F
    .locals 0

    .line 1
    iget-object p0, p0, Ljc0;->X:Lea0;

    .line 2
    .line 3
    invoke-interface {p0}, Lea0;->getDensity()Lfi1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lfi1;->b0()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, Ljc0;->X:Lea0;

    .line 2
    .line 3
    invoke-interface {p0}, Lea0;->getDensity()Lfi1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lfi1;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
