.class public final Lsl6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldx7;


# static fields
.field public static final j0:Ljava/util/TreeMap;


# instance fields
.field public volatile X:Ljava/lang/String;

.field public final Y:[J

.field public final Z:[D

.field public final f0:[Ljava/lang/String;

.field public final g0:[[B

.field public final h0:[I

.field public i0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsl6;->j0:Ljava/util/TreeMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    new-array v0, p1, [I

    .line 7
    .line 8
    iput-object v0, p0, Lsl6;->h0:[I

    .line 9
    .line 10
    new-array v0, p1, [J

    .line 11
    .line 12
    iput-object v0, p0, Lsl6;->Y:[J

    .line 13
    .line 14
    new-array v0, p1, [D

    .line 15
    .line 16
    iput-object v0, p0, Lsl6;->Z:[D

    .line 17
    .line 18
    new-array v0, p1, [Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lsl6;->f0:[Ljava/lang/String;

    .line 21
    .line 22
    new-array p1, p1, [[B

    .line 23
    .line 24
    iput-object p1, p0, Lsl6;->g0:[[B

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final h(ID)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsl6;->h0:[I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aput v1, v0, p1

    .line 5
    .line 6
    iget-object p0, p0, Lsl6;->Z:[D

    .line 7
    .line 8
    aput-wide p2, p0, p1

    .line 9
    .line 10
    return-void
.end method

.method public final i(IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsl6;->h0:[I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aput v1, v0, p1

    .line 5
    .line 6
    iget-object p0, p0, Lsl6;->Y:[J

    .line 7
    .line 8
    aput-wide p2, p0, p1

    .line 9
    .line 10
    return-void
.end method

.method public final j(I[B)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsl6;->h0:[I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aput v1, v0, p1

    .line 5
    .line 6
    iget-object p0, p0, Lsl6;->g0:[[B

    .line 7
    .line 8
    aput-object p2, p0, p1

    .line 9
    .line 10
    return-void
.end method

.method public final l(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lsl6;->h0:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aput v0, p0, p1

    .line 5
    .line 6
    return-void
.end method

.method public final t(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsl6;->h0:[I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aput v1, v0, p1

    .line 5
    .line 6
    iget-object p0, p0, Lsl6;->f0:[Ljava/lang/String;

    .line 7
    .line 8
    aput-object p2, p0, p1

    .line 9
    .line 10
    return-void
.end method
