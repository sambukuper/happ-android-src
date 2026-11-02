.class public final Lh26;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Lg26;

.field public static final c:Lh26;


# instance fields
.field public final a:Lz05;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lg26;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, v2}, Lg26;-><init>(ZLjava/util/HashSet;Ljava/util/HashSet;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh26;->b:Lg26;

    .line 9
    .line 10
    new-instance v0, Lh26;

    .line 11
    .line 12
    invoke-direct {v0}, Lh26;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lh26;->c:Lh26;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz05;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lz05;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Lz05;->X:I

    .line 18
    .line 19
    iput-boolean v1, v0, Lz05;->Y:Z

    .line 20
    .line 21
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lz05;->g0:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Lz05;->h0:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    sget-object v2, Lh26;->b:Lg26;

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, v0, Lz05;->f0:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v0, p0, Lh26;->a:Lz05;

    .line 45
    .line 46
    return-void
.end method
