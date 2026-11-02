.class public final Lur2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsd1;


# instance fields
.field public final a:Ld73;

.field public final b:Lpd5;


# direct methods
.method public constructor <init>(Ld73;Lpd5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lur2;->a:Ld73;

    .line 5
    .line 6
    iput-object p2, p0, Lur2;->b:Lpd5;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ltb2;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    check-cast p1, Ls51;

    .line 8
    .line 9
    new-instance p0, Lpg3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p0, v0, v1, v2}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lb02;->X:Lb02;

    .line 17
    .line 18
    invoke-static {v0, p0, p1}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
