.class public final Lz50;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqd1;


# instance fields
.field public final a:Lk17;

.field public final b:Le62;


# direct methods
.method public constructor <init>(Lk17;Le62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz50;->a:Lk17;

    .line 5
    .line 6
    iput-object p2, p0, Lz50;->b:Le62;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lle7;Lpd5;)Lsd1;
    .locals 2

    .line 1
    new-instance v0, Lb60;

    .line 2
    .line 3
    iget-object p1, p1, Lle7;->a:Ld73;

    .line 4
    .line 5
    iget-object v1, p0, Lz50;->a:Lk17;

    .line 6
    .line 7
    iget-object p0, p0, Lz50;->b:Le62;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, v1, p0}, Lb60;-><init>(Ld73;Lpd5;Lk17;Le62;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
