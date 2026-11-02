.class public final Lea7;
.super Lzh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final Z:Lch8;


# direct methods
.method public constructor <init>(Laa7;Lch8;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lzh1;-><init>(Laa7;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lea7;->Z:Lch8;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final m0()Lch8;
    .locals 0

    .line 1
    iget-object p0, p0, Lea7;->Z:Lch8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final y0(Laa7;)Lyh1;
    .locals 1

    .line 1
    new-instance v0, Lea7;

    .line 2
    .line 3
    iget-object p0, p0, Lea7;->Z:Lch8;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lea7;-><init>(Laa7;Lch8;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
