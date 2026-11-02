.class public final Lmt5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ler8;
.implements Li63;
.implements Le98;


# instance fields
.field public final X:Lqd5;


# direct methods
.method public constructor <init>(Lqd5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmt5;->X:Lqd5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m()Ll11;
    .locals 0

    .line 1
    iget-object p0, p0, Lmt5;->X:Lqd5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()I
    .locals 1

    .line 1
    sget-object v0, Le63;->p:Lzx;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
