.class public final Lwx6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lnf5;


# instance fields
.field public final X:I

.field public final Y:Ljava/util/List;

.field public Z:Ljava/lang/Float;

.field public f0:Ljava/lang/Float;

.field public g0:Ljx6;

.field public h0:Ljx6;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwx6;->X:I

    .line 5
    .line 6
    iput-object p2, p0, Lwx6;->Y:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lwx6;->Z:Ljava/lang/Float;

    .line 10
    .line 11
    iput-object p1, p0, Lwx6;->f0:Ljava/lang/Float;

    .line 12
    .line 13
    iput-object p1, p0, Lwx6;->g0:Ljx6;

    .line 14
    .line 15
    iput-object p1, p0, Lwx6;->h0:Ljx6;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lwx6;->Y:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
