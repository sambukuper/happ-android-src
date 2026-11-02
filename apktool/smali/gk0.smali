.class public final Lgk0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfk6;


# instance fields
.field public final synthetic b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lgk0;->b:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lgk0;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b(Lfk0;)Lek6;
    .locals 0

    .line 1
    iget-byte p0, p1, Lfk0;->a:B

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    sget-object p0, Lek6;->d:Lek6;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object p0, Lek6;->e:Lek6;

    .line 10
    .line 11
    return-object p0
.end method
