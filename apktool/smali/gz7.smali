.class public final Lgz7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsd1;


# static fields
.field public static final d:Lzx6;


# instance fields
.field public final a:Ld73;

.field public final b:Lpd5;

.field public final c:Lgn2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzx6;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lzx6;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgz7;->d:Lzx6;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ld73;Lpd5;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgz7;->a:Ld73;

    .line 5
    .line 6
    iput-object p2, p0, Lgz7;->b:Lpd5;

    .line 7
    .line 8
    iput-object p3, p0, Lgz7;->c:Lgn2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lhr5;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ls51;

    .line 9
    .line 10
    new-instance p0, Lpg3;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {p0, v0, v1, v2}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lb02;->X:Lb02;

    .line 18
    .line 19
    invoke-static {v0, p0, p1}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
