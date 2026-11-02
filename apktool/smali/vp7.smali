.class public final Lvp7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lyp7;

.field public b:Lb44;

.field public final c:Ltp7;

.field public final d:Ltp7;

.field public final e:Ltp7;


# direct methods
.method public constructor <init>(Lyp7;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvp7;->a:Lyp7;

    .line 5
    .line 6
    new-instance p1, Ltp7;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Ltp7;-><init>(Lvp7;B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lvp7;->c:Ltp7;

    .line 13
    .line 14
    new-instance p1, Ltp7;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p0, v0}, Ltp7;-><init>(Lvp7;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lvp7;->d:Ltp7;

    .line 21
    .line 22
    new-instance p1, Ltp7;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, v0}, Ltp7;-><init>(Lvp7;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lvp7;->e:Ltp7;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lb44;
    .locals 0

    .line 1
    iget-object p0, p0, Lvp7;->b:Lb44;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
