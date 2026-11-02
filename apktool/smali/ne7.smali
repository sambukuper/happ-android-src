.class public final Lne7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Iterator;
.implements Lqv3;


# instance fields
.field public final X:Lyb7;

.field public final Y:I

.field public final Z:Lg33;

.field public final f0:I

.field public g0:I


# direct methods
.method public constructor <init>(Lyb7;ILnp2;Lg33;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lne7;->X:Lyb7;

    .line 5
    .line 6
    iput p2, p0, Lne7;->Y:I

    .line 7
    .line 8
    iput-object p4, p0, Lne7;->Z:Lg33;

    .line 9
    .line 10
    iget p1, p1, Lyb7;->j0:I

    .line 11
    .line 12
    iput p1, p0, Lne7;->f0:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
