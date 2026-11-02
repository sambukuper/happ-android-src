.class public final Luf1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# static fields
.field public static final b:Luf1;

.field public static final c:Luf1;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luf1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Luf1;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Luf1;->b:Luf1;

    .line 8
    .line 9
    new-instance v0, Luf1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Luf1;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Luf1;->c:Luf1;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Luf1;->a:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Lmq5;Lq51;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Luf1;->a:B

    .line 2
    .line 3
    sget-object p1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    return-object p1
.end method
