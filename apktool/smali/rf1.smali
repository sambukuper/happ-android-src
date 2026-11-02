.class public final Lrf1;
.super Lob6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final X:Lpb6;


# direct methods
.method public constructor <init>(Lpb6;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lob6;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrf1;->X:Lpb6;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B()Lpw3;
    .locals 0

    .line 1
    iget-object p0, p0, Lrf1;->X:Lpb6;

    .line 2
    .line 3
    invoke-interface {p0}, Lxu3;->j()Lpw3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final Q()Ljava/util/List;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f()Lkb6;
    .locals 0

    .line 1
    iget-object p0, p0, Lrf1;->X:Lpb6;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, Lzv3;

    .line 7
    .line 8
    invoke-interface {p0}, Lzv3;->d()Luv3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Lkb6;

    .line 16
    .line 17
    return-object p0
.end method
